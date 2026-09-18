package ChatGpt;

abstract class EmployeeData implements ICalculateSalary{
    private final String name;
    private final int workingHours;
    private final double ratePerHour;

    public EmployeeData(String name, int workingHours, double ratePerHour) {
        this.name = name;
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
    }

    public String getName() {
        return name;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    @Override

    public double calculateSalary(){
        return getRatePerHour() * getWorkingHours();
    }

    @Override
    public String toString() {
        return "EmployeeData{" +
                "name='" + name + '\'' +
                ", workingHours=" + workingHours +
                ", ratePerHour=" + ratePerHour +
                "Total Salary =" +calculateSalary()+
                '}';
    }
}
interface ICalculateSalary{
    double calculateSalary();
}

class FullTimeEmployee extends EmployeeData{

    private final String dept;

    public FullTimeEmployee(String name, int workingHours, double ratePerHour, String dept) {
        super(name, workingHours, ratePerHour);
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "dept='" + dept + '\'' +
                '}' + super.toString();
    }
}

class PartTimeEmployee extends EmployeeData {

    private final String dept;

    public PartTimeEmployee(String name, int workingHours, double ratePerHour, String dept) {
        super(name, workingHours, ratePerHour);
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "dept='" + dept + '\'' +
                '}'+super.toString()  ;
    }
}
public class Employee {
    public static void main(String[] args) {


        EmployeeData employee = new PartTimeEmployee("ALI", 8 ,83.54,"Development");
        System.out.println(employee);
    }
}
