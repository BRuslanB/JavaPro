package Lesson_Pr_4_5and6;

public class Student extends User {
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;

    public Student() {

    }
    public Student(int id, String login, String password, String name, double gpa){
        super(id, login, password, name);
        this.gpa = gpa;
    }

    public double getGpa(){
        return gpa;
    }

    public void addCourse(String course){
        courses[indexOfCourses] = course;
        indexOfCourses++;
    }

    public void printCourse(){
        for (int i = 0; i<indexOfCourses; i++)
            System.out.println(i+1 + ") " + courses[i]);
    }

    public String getData(){
        return "ID: " + id + ", Login: " + login + ", Password: " + password + ", Name: " + name +
                ", GPA: " + gpa + ", IndexOfCourses: " + indexOfCourses;
    }

    public void setGpa(){
        this.gpa = gpa;
    }
}