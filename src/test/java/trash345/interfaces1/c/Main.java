package trash345.interfaces1.c;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Rectangle class with an initial size
        Rectangle rectangle = new Rectangle(100, 150);
        
        // Print the initial size of the rectangle
        rectangle.printSize();

        // Resize the rectangle by changing its width and height
        rectangle.resizeWidth(150);
        rectangle.resizeHeight(200);
        
        // Print the updated size of the rectangle
        rectangle.printSize();
    }
}