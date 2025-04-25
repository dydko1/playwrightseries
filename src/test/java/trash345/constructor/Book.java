package trash345.constructor;

public class Book {

    private String title;
    private String author;
    private double price;

    Book() {
        this("Unknown", "Unknown", 0);
    }

    Book(String title, String author) {
    }

    Book(String title, String author, double price) {
        this(title, author);
        this.price = price;
    }

}
