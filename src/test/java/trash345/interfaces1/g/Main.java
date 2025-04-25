package trash345.interfaces1.g;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Searchable> list = new ArrayList<>();
        // Create an instance of the Document class with a sample content
        Searchable document = new Document("This is a sample document.");

        // Search for a keyword in the document and store the result
        boolean documentContainsKeyword = document.search("sample");

        // Print whether the document contains the keyword
        System.out.println("Document contains keyword 'sample': " + documentContainsKeyword);

        // Create an instance of the WebPage class with a sample URL and HTML content
        Searchable webPage = new WebPage("https://www.w3resource.com", "This is a sample webpage.");

        // Search for a keyword in the webpage and store the result
        boolean webPageContainsKeyword = webPage.search("webpage");

        // Print whether the webpage contains the keyword
        System.out.println("Webpage contains keyword 'webpage': " + webPageContainsKeyword);
        System.out.println("---------------");

        list.add(document);
        list.add(webPage);
        for (Searchable s : list) {
            System.out.println(s.search("sample1"));
        }
    }
}