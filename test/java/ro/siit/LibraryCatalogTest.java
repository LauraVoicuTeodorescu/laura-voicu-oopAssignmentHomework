package ro.siit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryCatalogTest {

    @Test
    public void testAddBook() {
        // Create a LibraryCatalog instance
        LibraryCatalog libraryCatalog = new LibraryCatalog();

        // Create some test books
        Book novel = new Novel("The Great Gatsby", 180, "Fiction");
        Book album = new Album("The Art of War", 200, "High");

        // Add the books to the catalog
        libraryCatalog.addBook(novel);
        // Assert that the book is added correctly
        Assertions.assertEquals(1, libraryCatalog.getNumberOfItems());

        libraryCatalog.addBook(album);
        Assertions.assertEquals(2, libraryCatalog.getNumberOfItems());

        // Assert that books are added correctly
        Assertions.assertTrue(libraryCatalog.getBooks().contains(novel));
        Assertions.assertTrue(libraryCatalog.getBooks().contains(album));
    }

    @Test
    public void testDeleteBook() {
        // Create a LibraryCatalog instance
        LibraryCatalog libraryCatalog = new LibraryCatalog();

        // Create some test books
        Book novel = new Novel("The Great Gatsby", 180, "Fiction");
        Book album = new Album("The Art of War", 200, "High");

        // Add the books to the catalog
        libraryCatalog.addBook(novel);
        libraryCatalog.addBook(album);

        // Delete a book
        libraryCatalog.deleteBook(novel);

        // Assert that the book is deleted correctly
        Assertions.assertFalse(libraryCatalog.getBooks().contains(novel));
        Assertions.assertTrue(libraryCatalog.getBooks().contains(album));
    }

    @Test
    public void testListBooks() {
        // Create a LibraryCatalog instance
        LibraryCatalog libraryCatalog = new LibraryCatalog();

        // Create some test books
        Book novel = new Novel("The Great Gatsby", 180, "Fiction");
        Book album = new Album("The Art of War", 200, "High");

        // Add the books to the catalog
        libraryCatalog.addBook(novel);
        libraryCatalog.addBook(album);

        // List all books
        libraryCatalog.listBooks();

        // No assertions needed for this method as it's just for printing
    }

    @Test
    public void testDisplayAlbum() {
        // Create an Album instance
        Album album = new Album("The Art of War", 200, "High");

        // Assert that display method returns correct string
        Assertions.assertEquals("The Art of War - High - 200", album.display());
    }

    @Test
    public void testDisplayNovel() {
        // Create a Novel instance
        Novel novel = new Novel("The Great Gatsby", 180, "Fiction");

        // Assert that display method returns correct string
        Assertions.assertEquals("The Great Gatsby - Fiction - 180", novel.display());
    }
}
