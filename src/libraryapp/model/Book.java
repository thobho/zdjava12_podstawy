package libraryapp.model;

public class Book {

    //modyfikatopry dostępu pól i metod : private, public, (protected), <<domyślny jest dostęp pakietowy>>>

    private int bookId;
    private String title;
    private String author;
    //todo w przyszłości dodać czytelnika
    //todo w przyszłości dodać datę do kiedy ksążka ma być oddana

    private static int idCounter = 0;

    public Book(String title, String author) {
        this.bookId = idCounter;
        idCounter++;
        this.title = title;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
