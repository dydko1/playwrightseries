package creationalpatterns.training.medium.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {
    public static void main(String[] args) {
        List<String> contents = new ArrayList<>();
        contents.add("Chapter 1: Introduction");
        contents.add("Chapter 2: Java Basics");

        Book originalBook = new Book("Effective Java", "Joshua Bloch", contents);
        Book clonedBook = (Book) originalBook.clone();

        System.out.println("Original Book: " + originalBook);
        System.out.println("Cloned Book: " + clonedBook);

        // Modifying the clone's contents
        clonedBook.getContents().add("Chapter 3: Concurrency");

        System.out.println("\nAfter modifying the cloned book's contents:");
        System.out.println("Original Book: " + originalBook);
        System.out.println("Cloned Book: " + clonedBook);
    }
}