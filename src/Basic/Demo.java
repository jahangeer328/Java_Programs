package Basic;

class Student1{

    private final String name;
    private final String grade;
    private final int age;


    public Student1(String name , String grade , int age){
        this.name = name;
        this.grade = grade;
        this.age = age;

    }

    public String getName(){
        return name;
    }

    public String getGrade(){
        return grade;
    }

    public int getAge(){
        return  age;
    }


    @Override
    public String toString(){
        return "[ Name is  : " + name + ", Grade is : " + grade + ", Age is :" +age+"]";
    }
}
public class Demo {

    public static void main(String[] args) {

        Student1 student = new Student1("Jahangeer","12th" ,18);
        System.out.println("//Student Data//");
        System.out.println(student);
    }
}
