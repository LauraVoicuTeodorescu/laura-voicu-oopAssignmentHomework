package ro.siit;

// Album class extending Book
class Album extends Book {
    private String paperQuality;

    public Album(String name, int numberOfPages, String paperQuality) {
        super(name, numberOfPages);
        this.paperQuality = paperQuality;
    }

    @Override
    public String display() {
        //TODO Implement display for Album:
        //  <name> - <paperQuality> - <numberOfPages>
        return getName() + " - " + paperQuality + " - " + getNumberOfPages();
    }

    // Getter for paper quality
    public String getPaperQuality() {
        return paperQuality;
    }
}
