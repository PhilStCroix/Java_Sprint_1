import java.time.LocalDate;

public class Book implements Borrowable {
    private String title;
    private Author author;
    private String ISBN;
    private String publisher;
    private int numberOfCopies;
    private Status status;
    private LocalDate dueDate;

    public Book(String title, Author author, String ISBN, String publisher, int numberOfCopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.numberOfCopies = numberOfCopies;
        this.status = Status.AVAILABLE;
        dueDate = null;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public boolean borrowBook() {
        if (status == Status.AVAILABLE) {
            status = Status.CHECKED_OUT;
            return true;
        }
        return false;
    }

    @Override
    public boolean returnBook() {
        if (status == Status.CHECKED_OUT) {
            status = Status.AVAILABLE;
            return true;
        }
        return false;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
