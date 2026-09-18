package MY_PROJECTS_JUN;

public class TestClass {

    public static void main(String[] args) {

//        User user = new User(101,"Ali","ali@gmail.com",true);
//        System.out.println(user.getProfileDetails());
//        String a = user.getEmail();
//        System.out.println(a);

        Book book = new Book(101 ,"Java One" ,"Jain mosle" ,BookStatus.ISSUED);
      //  System.out.println(book);

        Student student = new Student("2k24/BLCS/25" ,"Jahangeer" , 2024,StudentStatus.UNDERGRADUATE);
       // System.out.println(student);

        LibraryManagementSystem lms = new LibraryManagementSystem(book,student);
        lms.issueBook();
      String x =  lms.getDetails();
        System.out.println(x);
    }
}
