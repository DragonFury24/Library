/**
 *
 */
//package period1;

/**
 * Simulates a Patron with a name and three books
 *
 * @author kabaram
 */
public class Patron {

    //the name of this Patron
    private String name;
    //the books of this Patron
    private Book[] books = new Book[50];

    /**
     * Instantiates a Patron with a name and three null books
     *
     * @param n, the name of the name
     */
    public Patron(String n) {
        name = n;
    }

    /**
     * @return the name of this Patron
     */
    public String name() {
        return name;
    }

    /**
     * @param title, the title of the book to determine if borrowed
     * @return true if this Patron has borrowed a given book (identified by title)
     */
    public boolean hasBorrowed(String title) {
        for (Book book : books)
            if (book != null && book.getTitle().equals(title))
                return true;
        return false;
    }

    /**
     * Returns a given book (identified by title)
     *
     * @param title, the title of the book to attempt to return
     */
    public void returnBook(String title) {
        for (int i = 0; i < books.length; i++)
            if (books[i] != null &&  books[i].getTitle().equals(title)) {
                books[i] = null;
                return;
            }
    }

    /**
     * Attempts to borrow a book, if the Patron has books available
     *
     * @param title,  the title of the book to borrow
     * @param author, the author of the book to borrow
     */
    public void borrowBook(String title, String author) {
        for (int i = 0; i < books.length; i++)
            if (books[i] == null) {
                books[i] = new Book(title, author);
                return;
            }
    }

    /**
     * @return a String representation of this Patron in the following format:
     * Name:
     * Book 1: book1
     * Book 2: book2
     * Book 3: book3
     */
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String ans = "";

        for (int i = 0; i < books.length; ) {
            if (books[i] == null)
                continue;
            stringBuilder.append("Book " ).append(i).append(": ").append(books[i].toString()).append("\n");
            i++;
        }
//        return name + "\n" +
//                "Book 1: " + books[0].toString() + "\n" +
//                "Book 2: " + books[1].toString() + "\n" +
//                "Book 3: " + books[2].toString() + "\n";
        return stringBuilder.toString();
    }
}
