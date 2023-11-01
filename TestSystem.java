import java.util.List;

public class TestSystem {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library();

        // Create authors
        Author author1 = new Author("John Smith");
        Author author2 = new Author("Jane Doe");

        // Create books
        Book book1 = new Book("Book 1", author1, "1234567890", "Publisher A", 5);
        Book book2 = new Book("Book 2", author2, "0987654321", "Publisher B", 3);
        Book book3 = new Book("Book 3", author1, "1112223334", "Publisher C", 2);

        // Add authors and books to the library
        library.addAuthor(author1);
        library.addAuthor(author2);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Create patrons
        Patron patron1 = new Patron("Alice", "123 Main St", "555-123-4567");
        Patron patron2 = new Patron("Bob", "456 Elm St", "555-987-6543");

        // Add patrons to the library
        library.addPatron(patron1);
        library.addPatron(patron2);

        // Search for books by title
        System.out.println("Books by title 'Book 1':");
        List<Book> booksByTitle = library.searchBooksByTitle("Book 1");
        for (Book book : booksByTitle) {
            System.out.println(book.getTitle());
        }

        // Search for books by author
        System.out.println("Books by author 'John Smith':");
        List<Book> booksByAuthor = library.searchBooksByAuthor(author1);
        for (Book book : booksByAuthor) {
            System.out.println(book.getTitle());
        }

        // Patron borrows a book
        System.out.println("Patron 1 borrows a book:");
        patron1.borrowBook(book1);
        System.out.println("Book status: " + book1.getStatus());

        // Patron 2 tries to borrow the same book
        System.out.println("Patron 2 tries to borrow a book:");
        patron2.borrowBook(book1);
        System.out.println("Book status: " + book1.getStatus());

        // Patron 1 returns the book
        System.out.println("Patron 1 returns a book:");
        patron1.returnBook(book1);
        System.out.println("Book status: " + book1.getStatus());

        // Patron 2 borrows the book
        System.out.println("Patron 2 borrows a book:");
        patron2.borrowBook(book1);
        System.out.println("Book status: " + book1.getStatus());
    }
}
