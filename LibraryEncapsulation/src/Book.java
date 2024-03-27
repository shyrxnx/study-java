public class Book {

    private String title;
    private String author;
    private boolean isAvailable;

    Book (String title, String author, boolean isAvailable)  {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public String getTitle(String title) {
        return title;
    }

    public String getAuthor(String author) {
        return author;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

}
