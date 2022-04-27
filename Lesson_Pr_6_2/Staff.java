package Lesson_Pr_6_2;

public class Staff implements Workers{
    int id;
    String name;
    String surname;
    double salary;

    public Staff(){

    }

    public Staff(int id, String name, String surname, int salary){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String getWorkerData() {
        return "ID: " + id + ", Name: " + name + ", SurName: " + surname + ", Salary: " + salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}