package creationalpatterns.training.medium.prototype;

import java.util.ArrayList;
import java.util.List;

public class Book implements Prototype {
    private String title;
    private String author;
    private List<String> contents;

    public Book(String title, String author, List<String> contents) {
        this.title = title;
        this.author = author;
        this.contents = contents;
    }

    // Getters and Setters for title, author, and contents
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String> getContents() {
        return contents;
    }

    public void setContents(List<String> contents) {
        this.contents = contents;
    }

    @Override
    public Prototype clone() {
        List<String> clonedContents = new ArrayList<>(this.contents);
        return new Book(this.title, this.author, clonedContents);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", contents=" + contents +
                '}';
    }
}