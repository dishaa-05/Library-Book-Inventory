import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    @Test
    public void testBook() {
        Library library = new Library();

        Book book = new Book("Java", "James", "101", 2024);
        library.addBook(book);

        assertEquals("Java", book.getTitle());
        assertEquals("James", book.getAuthor());
        assertEquals("101", book.getIsbn());
        assertEquals(2024, book.getPublicationYear());
    }

    @Test
    public void testUpdateBook() {
        Library library = new Library();

        Book book = new Book("Java", "James", "101", 2024);
        library.addBook(book);

        library.updateBook("101", "Python", "John", 2025);

        assertEquals("Python", book.getTitle());
        assertEquals("John", book.getAuthor());
        assertEquals(2025, book.getPublicationYear());
    }
        @Test
    public void testDeleteBook() {
        Library library = new Library();

        Book book = new Book("Java", "James", "101", 2024);
        library.addBook(book);

        library.deleteBook("101");

        library.updateBook("101", "Python", "John", 2025);

        assertEquals("Java", book.getTitle());
        assertEquals("James", book.getAuthor());
        assertEquals(2024, book.getPublicationYear());
    }
        @Test
    public void testViewBooks() {
        Library library = new Library();

        Book book = new Book("Java", "James", "101", 2024);
        library.addBook(book);

        assertEquals("Java", book.getTitle());
    }
}