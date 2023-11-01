import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Author> authors;
    private List<Patron> patrons;

    public Library() {
        books = new ArrayList<>();
        authors = new ArrayList<>();
        patrons = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public List<Book> searchBooksByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> searchBooksByAuthor(Author author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor() == author) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> searchBooksByISBN(String ISBN) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getISBN().equalsIgnoreCase(ISBN)) {
                result.add(book);
            }
        }
        return result;
    }

    public void checkForOverdueBooks() {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Iterate through all books
        for (Book book : books) {
            LocalDate dueDate = book.getDueDate();

            if (dueDate != null && dueDate.isBefore(currentDate)) {
                // The book is overdue
                System.out.println("Book '" + book.getTitle() + "' is overdue.");
            }
        }
    }
}
