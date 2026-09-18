package MY_PROJECTS_JUN;

enum BookStatus{
    AVAILABLE,ISSUED;
}
final class Book {

    private final int book_id;
    private final String title;
    private final String author;
    private final BookStatus bookStatus;

    public Book(int book_id, String title, String author ,BookStatus bookStatus) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.bookStatus = bookStatus;
    }

    public int getBook_id() {
        return book_id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public BookStatus getBookStatus(){
        return bookStatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", bookStatus=" + bookStatus +
                '}';
    }
}
