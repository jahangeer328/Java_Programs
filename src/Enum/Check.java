package Enum;


enum StudentStatus{

    ACTIVE,NONACTIVE;
}
public class Check {
    public static void main(String[] args) {

        StudentStatus s = StudentStatus.NONACTIVE;

        if(s.equals(StudentStatus.ACTIVE)){
            System.out.println("Active ...");
        }else{
            System.out.println("Not Active ...");
        }
    }
}
