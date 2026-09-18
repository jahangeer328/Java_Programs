package Basic;

class Employee{

    private int id;
    private String name;
    private String type;

    Employee(){}

    Employee(int id , String name , String type){
        this.id = id;
        this.name  = name;
        this.type = type;
    }

    public String toString(){
        return "[ ID : "  +id + ", Name : " + name + ", Type : " +type+"]";
    }
}
public class EmployeeMain {
    public static void main(String[] args) {


        Employee emp = new Employee(1,"Ali" , "FullTime");
        Employee emp1 = new Employee();
        System.out.println(emp);
    }
}
