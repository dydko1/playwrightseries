package trash345.interfaces1.g;

class WebPage implements Searchable {
    // Declare private instance variables to store the URL and HTML content
    private String url;
    private String htmlContent;

    // Constructor for initializing the URL and HTML content
    public WebPage(String url, String htmlContent) {
        this.url = url;
        this.htmlContent = htmlContent;
    }

    // Implement the "search" method required by the Searchable interface
    public boolean search(String keyword) {
        // Check if the HTML content contains the specified keyword
        return htmlContent.contains(keyword);
    }
}