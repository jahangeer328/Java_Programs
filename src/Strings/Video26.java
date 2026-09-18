package Strings;

class Student{

    private String name;
    private int age;

    Student(){}

    Student(String name , int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
public class Video26 {
    public static void main(String[] args) {


        Student s1 = new Student("Jahangeer", (int) 17.99999990);
       // System.out.println(s1.getAge());
        if(s1.getAge() >= 18){
            System.out.println("You can Drive!!");
        }else{
            System.out.println("You can't drive!!!");
        }
        System.out.println(s1.getName());
    }
}
