package ro.siit;

import java.util.ArrayList;
import java.util.List;

// Library Catalog class
public class LibraryCatalog {
    private List<Book> books;

    public LibraryCatalog() {
        this.books = new ArrayList<>();
    }

    // Method to add a book
    public void addBook(Book book) {
        //TODO Implement addBook
        books.add(book);
    }

    // Method to delete a book
    public void deleteBook(Book book) {
        //TODO Implement deleteBook
        books.remove(book);
    }

    // Method to list all books
    public void listBooks() {
        //TODO Implement listBooks
        for (Book book : books) {
            System.out.println(book.display());
        }
    }

    // Method to get all books
    public List<Book> getBooks() {
        //TODO Implement getBooks
        //return null;
        return new ArrayList<>(books);  // Return a copy of the list to prevent external modifications
    }

    // Method to get the number of items
    public int getNumberOfItems() {
        //TODO implement get number of items
        //return 0;
        return books.size();
    }

    // Test method to validate functionality
    public static void main(String[] args) {
        // Test your methods here
    }
}
