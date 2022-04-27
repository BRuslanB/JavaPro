package Lesson_Pr_4_3and4;

public class Swimmer extends Sportsman{
    String style;
    double recordTime;

    public Swimmer(){

    }

    public Swimmer (String fullName, int age, String country, String style, double recordTime){
        super(fullName, age, country);
        this.style = style;
        this.recordTime = recordTime;
    }

    public void play(){
        System.out.println("Swimmer swims in the pool");
    }
}