import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private List<Book> booksWritten;

    public Author(String name) {
        this.name = name;
        this.booksWritten = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooksWritten() {
        return booksWritten;
    }

    public void addBook(Book book) {
        booksWritten.add(book);
    }
}
