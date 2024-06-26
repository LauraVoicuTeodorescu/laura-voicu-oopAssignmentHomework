package ro.siit;

// Abstract class for Book
abstract class Book {
    private String name;
    private int numberOfPages;

    public Book(String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    public abstract String display();

    // Getters and setters
    public String getName() {
        return name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}