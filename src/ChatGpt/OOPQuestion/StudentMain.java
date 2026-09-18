package ChatGpt.OOPQuestion;

final class Student{
    private final  String name;
    private final  String fname;
    private final int age;

    public Student(String name, String fname, int age){
        this.name = name;
        this.fname = fname;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getFname(){
        return fname;
    }

    public int getAge(){
        return age;
    }

}
public class StudentMain {
    public static void main(String[] args) {

        // Student student = new Student(, , );
        Student student1 = new Student("Jahangeer", "Nisar Ali", 21);
        System.out.println(student1.getName());
        System.out.println(student1.getFname());
        System.out.println(student1.getAge());
    }
}


