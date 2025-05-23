import java.util.*;

public class LibrarySystem {
    private final Map<Integer, Book> bookMap = new HashMap<>();

    public void addBook(Book book) {
        bookMap.put(book.getId(), book);
        System.out.println("Book added successfully.");
    }

    public void displayBook(int id) throws BookNotFoundException {
        if (!bookMap.containsKey(id)) {
            throw new BookNotFoundException("Book with ID " + id + " not found.");
        }
        Book book = bookMap.get(id);
        book.DisplayDetails();

        if (book instanceof Ebooks) {
            System.out.println("This is an E-Book.");
        } else if (book instanceof PrintedBooks) {
            System.out.println("This is a Printed Book.");
        }
    }

    public void updateBookTitle(int id, String newTitle) throws BookNotFoundException {
        if (!bookMap.containsKey(id)) {
            throw new BookNotFoundException("Book with ID " + id + " not found.");
        }
        bookMap.get(id).setTitle(newTitle);
        System.out.println("Book title updated.");
    }

    public void deleteBook(int id) throws BookNotFoundException {
        if (!bookMap.containsKey(id)) {
            throw new BookNotFoundException("Book with ID " + id + " not found.");
        }
        bookMap.remove(id);
        System.out.println("Book deleted successfully.");
    }

    public void listAllBooks() {
        if (bookMap.isEmpty()) {
            System.out.println("No books to display.");
            return;
        }

        for (Book book : bookMap.values()) {
            book.DisplayDetails();
            System.out.println("--------------------------");
        }
    }
}
