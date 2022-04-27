package Lesson_Pr_2_7;

public class Player {
    private int number;
    private String name;
    private String surname;
    private String position;

    public Player(){

    }

    public Player (int number, String name, String surname, String position){
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public String toString(){
        return "Number: " + number + ", Name: " + name + ", Surname: " + surname + ", Position: " + position;
    }
}