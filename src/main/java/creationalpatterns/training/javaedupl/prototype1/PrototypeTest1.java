package creationalpatterns.training.javaedupl.prototype1;

public class PrototypeTest1 {
    public static void main(String[] args) {
        Book book = (Book) Registry.getElement("ksiazka123");
        Movie movie = (Movie) Registry.getElement("movie");

        System.out.println("Tytul:\t" + book.getTitle() + "\tid:\t" + book.hashCode());
        Book book1 = (Book) Registry.getElement("ksiazka123");
        System.out.println("Tytul:\t" + book1.getTitle() + "\tid:\t" + book1.hashCode());

        System.out.println("Tytul:\t" + movie.getTitle() + "\tid:\t" + movie.hashCode());
        Movie movie1=(Movie) Registry.getElement("movie");
        System.out.println("Tytul:\t" + movie1.getTitle() + "\tid:\t" + movie1.hashCode());
    }
}