package trash123.training;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class LegacyOrderController {

    private Connection databaseConnection;

    public LegacyOrderController(Connection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    public void processOrder(Map<String, Object> request) throws SQLException {
        // Extract input data
        String orderId = (String) request.get("orderId");
        String customerId = (String) request.get("customerId");
        double discount = (double) request.getOrDefault("discount", 0.0);
        List<String> items = (List<String>) request.get("items");
        boolean applyPriorityProcessing = (boolean) request.getOrDefault("priority", false);
        boolean sendEmailNotification = (boolean) request.getOrDefault("sendEmail", true);

        // TODO: Check for nulls and handle accordingly
        if (orderId == null || customerId == null || items == null || items.isEmpty()) {
            System.out.println("Error: Missing or invalid order details.");
            return;
        }

        // Validate discount (this is crucial, as there were past issues with invalid discounts)
        if (discount < 0 || discount > 50) {
            System.out.println("Error: Discount out of acceptable range.");
            return;
        }

        // Fetch customer details and order history
        PreparedStatement customerStatement = databaseConnection.prepareStatement(
            "SELECT is_vip, order_count FROM customers WHERE customer_id = ?"
        );
        customerStatement.setString(1, customerId);
        ResultSet customerResultSet = customerStatement.executeQuery();

        boolean isVip = false;
        int orderCount = 0;
        if (customerResultSet.next()) {
            isVip = customerResultSet.getBoolean("is_vip");
            orderCount = customerResultSet.getInt("order_count");
        } else {
            System.out.println("Error: Customer not found.");
            return;
        }

        // Check inventory availability for all items
        boolean inventoryAvailable = true;
        for (String item : items) {
            PreparedStatement inventoryStatement = databaseConnection.prepareStatement(
                "SELECT stock FROM inventory WHERE item_id = ?"
            );
            inventoryStatement.setString(1, item);
            ResultSet inventoryResultSet = inventoryStatement.executeQuery();

            if (inventoryResultSet.next()) {
                int stock = inventoryResultSet.getInt("stock");
                if (stock <= 0) {
                    inventoryAvailable = false;
                    System.out.println("Error: Item out of stock - " + item);
                    break;
                }
            } else {
                System.out.println("Error: Item not found - " + item);
                inventoryAvailable = false;
                break;
            }
        }

        if (!inventoryAvailable) {
            return;
        }

        // TODO: Handle order processing in batches to optimize performance
        if (orderCount > 10) {
            discount += 5; // Loyal customers get an additional discount
        }

        if (isVip) {
            discount += 10; // VIP customers get a special discount
        }

        if (applyPriorityProcessing && !isVip) {
            System.out.println("Warning: Priority processing is enabled for non-VIP customers.");
        }

        double totalAmount = 0.0;
        for (String item : items) {
            PreparedStatement priceStatement = databaseConnection.prepareStatement(
                "SELECT price FROM inventory WHERE item_id = ?"
            );
            priceStatement.setString(1, item);
            ResultSet priceResultSet = priceStatement.executeQuery();

            if (priceResultSet.next()) {
                double price = priceResultSet.getDouble("price");
                totalAmount += price;
            }
        }

        totalAmount -= totalAmount * (discount / 100);

        // Insert the order into the orders table
        PreparedStatement orderStatement = databaseConnection.prepareStatement(
            "INSERT INTO orders (order_id, customer_id, total_amount, discount_applied) VALUES (?, ?, ?, ?)"
        );
        orderStatement.setString(1, orderId);
        orderStatement.setString(2, customerId);
        orderStatement.setDouble(3, totalAmount);
        orderStatement.setDouble(4, discount);
        orderStatement.executeUpdate();

        // Update customer order count
        PreparedStatement updateCustomerStatement = databaseConnection.prepareStatement(
            "UPDATE customers SET order_count = order_count + 1 WHERE customer_id = ?"
        );
        updateCustomerStatement.setString(1, customerId);
        updateCustomerStatement.executeUpdate();

        // TODO: Add proper error handling for partial successes

        // Send email notification if enabled
        if (sendEmailNotification) {
            System.out.println("Sending email notification to customer " + customerId);
            // Simulated email sending (TODO: Integrate with email service)
        }

        // Final confirmation
        System.out.println("Order processed successfully with ID: " + orderId);
    }
}