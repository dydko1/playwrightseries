package trash123.interfaces.exc09;

public class Document implements Searchable {

    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public boolean search(String keyword) {
        return content.contains(keyword);
    }
}