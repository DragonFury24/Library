/**
 *
 */
//package period1;

/**
 * Simulates a Book with a title and author
 *
 * @author kabaram
 */
public class Book {
    //The title of this book
    String title;
    //The author of this book
    String author;

    /**
     * Instantiates a Book with title and author
     *
     * @param t title
     * @param a author
     */
    public Book(String t, String a) {
        title = t;
        author = a;
    }

    /**
     * @return the title of this book
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the author of this book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @return a String representing this book in the format:
     * "Title" by Author
     */
    public String toString() {
        return "\"" + title + "\"" + " by " + author + ".";
    }

}
