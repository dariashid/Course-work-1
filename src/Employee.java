public class Employee {
    private String fullName;
    private int departmentName;
    private int salary;
    private int id;

    public Employee (String fullName, int departmentName, int salary, int id){
        this.fullName = fullName;
        this.departmentName = departmentName;
        this.salary = salary;
        this.id = Main.counter++;

    }
    public String getFullName () {

        return fullName;
    }

    public int getDepartmentName() {

        return departmentName;
    }

    public int getSalary() {

        return salary;
    }

    public int getId() {

        return id;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public String toString () {return fullName + " " + departmentName + " " + salary;}
}
