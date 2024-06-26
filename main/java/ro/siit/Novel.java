package ro.siit;

// Novel class extending Book
class Novel extends Book {
    private String type;

    public Novel(String name, int numberOfPages, String type) {
        super(name, numberOfPages);
        this.type = type;
    }

    @Override
    public String display() {
        //TODO Implement display for Novel:
        // <name> - <type> - <numberOfPages>
        return getName() + " - " + type + " - " + getNumberOfPages();
    }

    // Getter for type
    public String getType() {
        return type;
    }
}
