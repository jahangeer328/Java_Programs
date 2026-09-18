package CollectionFrameWrok.SelfPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
    private String rollNo;
    private String name;
    private String fatherName;
    private int age;


    public Student(String rollNo, String name, String fatherName, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.fatherName = fatherName;
        this.age = age;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo='" + rollNo + '\'' +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", age=" + age +
                '}';
    }
}

class StudentUtils{

    private ArrayList<Student> students;

    StudentUtils(){
        students = new ArrayList<>();
    }

    public void addStudent(Student s1){
        students.add(s1);
    }

    public void removeStudent(String name){
       boolean isRemoved = false;
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getName().equalsIgnoreCase(name)){
                students.removeLast();
                System.out.println(name + " : Removed !!");
                isRemoved =true;
            }else{
                System.out.println("Not found");
            }

            break;

        }

    }

    public void print(){
        for (Student s : students){
            System.out.println(s);
        }
    }



}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("2k24/BLCS/25","Jahangeer","ABC", 21);
        Student s2 = new Student("2k24/BLCS/26","Ali","XYZ", 22);
        Student s3 = new Student("2k24/BLCS/27","Farhan","CDC", 24);
        Student s4 = new Student("2k24/BLCS/28","basit","HSC", 26);
        Student s5 = new Student("2k24/BLCS/29","shamsher","YMA", 19);

        StudentUtils utils = new StudentUtils();
        utils.addStudent(s1);
        utils.addStudent(s2);
        utils.addStudent(s3);
        utils.addStudent(s4);
        utils.addStudent(s5);

        utils.removeStudent("Jahangeer");
        utils.removeStudent("ali");
        utils.removeStudent("shamsher");
        utils.print();



    }
}


