package Basic;

class Book{
    private final int book_id;
    private final String book_name;
    private final String book_author;

    public Book(int book_id, String book_name, String book_author){
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_author = book_author;
    }

    public int getBook_id() {
        return book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public String getBook_author() {
        return book_author;
    }

//    @Override
//    public String toString(){
//        return "[ BOOK ID : " +book_id+", BOOK NAME  :" +book_name+", BOOK AUTHOR : "+book_author+"]";
//    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", book_name='" + book_name + '\'' +
                ", book_author='" + book_author + '\'' +
                '}';
    }


}

class Student{
    private final String roll_number;
    private final String name;
    private final String phone_number;
    private final int batch;

    public Student(String roll_number, String name, String phone_number, int batch) {
        this.roll_number = roll_number;
        this.name = name;
        this.phone_number = phone_number;
        this.batch = batch;
    }

    public String getRoll_number() {
        return roll_number;
    }

    public String getName() {
        return name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public int getBatch() {
        return batch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_number='" + roll_number + '\'' +
                ", name='" + name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", batch=" + batch +
                '}';
    }
}

class Library{

    private  Book book;
    private  Student student;

    public Library(Book book){
        this.book = book;
    }

    public void issueBook(Student student){
        System.out.println(book.getBook_name() +" >/Book issued student " + student.getRoll_number()+", " +student.getName());

    }
    @Override
    public String toString() {
        return "Library{" +
                "book=" + book +
                '}';
    }
}

public class LibraryMain {
    public static void main(String[] args) {

        Student student = new Student("2k24/BLCS/25","jahangir","+92341342",2024);
        Book book = new Book(101,"Python for data Science","gems elegy");
        Library library = new Library(book);
        System.out.println(library);
        library.issueBook(student);
    }
}
