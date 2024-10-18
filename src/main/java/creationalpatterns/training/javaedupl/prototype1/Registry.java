package creationalpatterns.training.javaedupl.prototype1;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private static Registry registry = new Registry();
    private Map<String, Element> elementMap = new HashMap<>();

    private Registry() {
        loadElements();
    }

    public static Element getElement(String element) {
        return registry
                .elementMap
                .get(element)
                .clone();
    }

    private void loadElements() {

        Book book1 = new Book();
        book1.setTitle("Miro w lesie");
        book1.setPrice("200");
        book1.setUrl("www.miroBook.pl");
        book1.setPageNumber("250");
        elementMap.put("ksiazka123", book1);

        Movie movie = new Movie();
        movie.setTitle("Miro gra w filmie");
        movie.setPrice("250");
        movie.setUrl("www.miroMovie.irg");
        movie.setMovieTime("900");
        elementMap.put("movie", movie);
    }
}