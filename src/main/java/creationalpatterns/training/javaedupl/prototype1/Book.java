package creationalpatterns.training.javaedupl.prototype1;

public class Book extends Element {

    String pageNumber;

    public Book() {
    }

    public Book(String title, String price, String url, String pageNumber) {
        super(title, price, url);
        this.pageNumber = pageNumber;
    }

    public String getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }
}