package libraryapp.model;

public class Library {

    private Book[] books;

    private int firstEmptyIndex;

    private static final int MAX_BOOKS_COUNT = 100;

    public Library() {
        this.books = new Book[MAX_BOOKS_COUNT];
        this.firstEmptyIndex = 0;
    }

    public void addBook(Book book) {
        //todo a co w przypadku, gdy ktoś chce dodać 100. książkę???
        this.books[firstEmptyIndex] = book;
        firstEmptyIndex++;
    }

    public void printBooks() {
        for (int i = 0; i < firstEmptyIndex; i++) {
            System.out.println(this.books[i]);
        }
    }

    public Book[] searchBook(String searchQuery) {
        Book[] searchResult = new Book[MAX_BOOKS_COUNT];

        int foundBooksCount = 0;

        for (int i = 0; i < this.firstEmptyIndex; i++) {
            Book bookToCheck = this.books[i];

            boolean authorCheck = bookToCheck.getAuthor().contains(searchQuery);
            boolean titleCheck = bookToCheck.getTitle().contains(searchQuery);

            if (authorCheck || titleCheck) {
                searchResult[i] = bookToCheck;
                foundBooksCount++;
            }
        }

        int actualIndex = 0;
        Book[] searchResultToReturn = new Book[foundBooksCount];

        for (int i = 0; i < searchResult.length; i++) {
            if (searchResult[i] != null) {
                searchResultToReturn[actualIndex] = searchResult[i];
                actualIndex++;
            }
        }

        return searchResultToReturn;
    }
    


}
