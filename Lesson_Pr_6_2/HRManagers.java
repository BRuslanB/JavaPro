package Lesson_Pr_6_2;

public class HRManagers implements Workers{
    int id;
    String fullName;
    double salary;

    public HRManagers(){

    }

    public HRManagers(int id, String fullName, double salary){
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    @Override
    public String getWorkerData() {
        return "ID: " + id + ", Full Name: " + fullName + ", Salary: " + salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}