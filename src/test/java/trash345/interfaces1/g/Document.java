package trash345.interfaces1.g;

class Document implements Searchable {
    // Declare a private instance variable to store the content of the document
    private String content;

    // Constructor for initializing the document's content
    public Document(String content) {
        this.content = content;
    }

    // Implement the "search" method required by the Searchable interface
    public boolean search(String keyword) {
        // Check if the content contains the specified keyword
        return content.contains(keyword);
    }
}