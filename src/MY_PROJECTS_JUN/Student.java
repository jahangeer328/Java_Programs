package MY_PROJECTS_JUN;

enum StudentStatus{
    UNDERGRADUATE,PASSOUT;
}
final class Student {

    private final String rollNo;
    private final String name;
    private final int batch;
    private final StudentStatus studentStatus;

    public Student(String rollNo, String name, int batch, StudentStatus studentStatus) {
        this.rollNo = rollNo;
        this.name = name;
        this.batch = batch;
        this.studentStatus = studentStatus;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getBatch() {
        return batch;
    }

    public StudentStatus getStudentStatus() {
        return studentStatus;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo='" + rollNo + '\'' +
                ", name='" + name + '\'' +
                ", batch=" + batch +
                ", studentStatus=" + studentStatus +
                '}';
    }
}
