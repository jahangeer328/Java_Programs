package MY_PROJECTS_JUN;

import java.util.ArrayList;

public class LibraryManagementSystem {

    private final Book book;
    private final Student student;

    public LibraryManagementSystem(Book book, Student student) {
        this.book = book;
        this.student = student;
    }

   public void issueBook(){
       System.out.println(book.getBook_id()+", Issued to " + student.toString());
   }

   public String getDetails(){
        return book.toString() + "\n And \n" + student.toString();
   }

//   public Book getBook(){
//        return book;
//   }
//
//   public Student getStudent(){
//        return student;
//   }
}
