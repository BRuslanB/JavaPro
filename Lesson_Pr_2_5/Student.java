package Lesson_Pr_2_5;

public class Student {
    private int id;
    private String name;
    private String surname;
    private double gpa;

    public Student (){
    }

    public Student (int id, String name, String surname, double gpa){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public double getGPA(){
        return this.gpa;
    }

    public String getStudentData(){
        return "ID: " + id + ", Name: " + name + ", Surname: " + surname + ", GPA: " + gpa;
    }
}