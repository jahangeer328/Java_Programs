class College{
    String name;
     String address;

    public College(String name, String address) {
        this.name = name;
        this.address = address;
    }

}
//immutable
final class Student{
    private final int age;
    private final String name;
    private final College college;

    Student(int age , String name , College college){
        this.age = age;
        this.name = name;
        this.college = new College(college.name , college.address);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public College getCollege() {
        return new College(this.college.name , this.college.address);
    }
}


public class ImmutabaleClasses {
    public static void main(String[] args) {
        College college = new College("Sindh" , "Laar");
        Student s1 = new Student(21 ,"Jahangeer", college);
//        System.out.println(s1.getName());
//        System.out.println(s1.getAge());
        s1.getCollege().name = "Main";
        s1.getCollege().address = " Badin";
        System.out.println(s1.getCollege().address);



    }
}
