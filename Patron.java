import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Book> borrowedBooks;

    public Patron(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (book.borrowBook()) {
            borrowedBooks.add(book);
        }
    }

    public void returnBook(Book book) {
        if (book.returnBook()) {
            borrowedBooks.remove(book);
        }
    }
}
