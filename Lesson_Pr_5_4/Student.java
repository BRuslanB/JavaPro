package Lesson_Pr_5_4;

public class Student extends User{
    private String name;
    private String surname;
    private String group;
    private double gpa;

    public Student() {

    }
    public Student(int id, String login, String password, String name, String surname, String group, double gpa){
        super(id, login, password);
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getGroup(){
        return group;
    }
    public double getGpa(){
        return gpa;
    }

    public void setName(){
        this.name = name;
    }

    public void setSurname(){
        this.surname = surname;
    }

    public void setGroup(){
        this.group = group;
    }

    public void setGpa(){
        this.gpa = gpa;
    }

    @Override
    public String getUserData(){
        return "ID: " + id + ", Login: " + login + ", Password: " + password + ", Name: " + name +
               ", SurName: " + surname + ", Group: " + group + ", GPA: " + gpa;
    }
}