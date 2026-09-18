//mutable class

class Factory{
    String name;
    String address;


    Factory(String name , String address){
        this.name = name;
        this.address = address;
    }
}
final class Employee{
    private final String name;
    private final String dept;
    private final double salary;
    private final Factory factory;

    public Employee(String name , String dept , double salary,Factory factory){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.factory = factory;

    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    public Factory getFactory(){
        return this.factory;
    }
}
public class Demo {
    public static void main(String[] args) {

        Factory factory = new Factory("Talhar Factory", "Talhar");
        Employee emp = new Employee("Farhan" ,"Chemical" , 20000, factory);
//        System.out.println(emp.getDept());
//        System.out.println(emp.getSalary());
//        System.out.println(emp.getName());
        emp.getFactory().address = "Badin";
        System.out.println(emp.getFactory().address);
    }
}
