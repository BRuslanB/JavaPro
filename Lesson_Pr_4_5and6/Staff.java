package Lesson_Pr_4_5and6;

public class Staff extends User{
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    public Staff(){

    }

    public Staff(int id, String login, String password, String name, double salary){
        super(id, login, password, name);
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public void addSubject(String subject){
        subjects[indexOfSubject] = subject;
        indexOfSubject++;
    }

    public void printSubject(){
        for (int i = 0; i<indexOfSubject; i++)
            System.out.println(i+1 + ") " + subjects[i]);
    }

    public String getData(){
        return "ID: " + id + ", Login: " + login + ", Password: " + password + ", Name: " + name +
                ", Salary: " + salary + ", IndexOfSubject: " + indexOfSubject;
    }

    public void setSalary(){
        this.salary = salary;
    }
}