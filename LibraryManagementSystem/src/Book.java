public class Book {

    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    Book(String title, String author, String ISBN, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = isAvailable;
    }

    public String getTitle(String title) {
        return title;
    }

    public String getAuthor(String author) {
        return author;
    }

    public String ISBN(String ISBN) {
        return ISBN;
    }

    public boolean isAvailable(boolean isAvailable) {
        return isAvailable;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }



}
