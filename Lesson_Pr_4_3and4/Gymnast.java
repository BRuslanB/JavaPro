package Lesson_Pr_4_3and4;

public class Gymnast extends Sportsman{
    int height;
    int weight;
    String style;

    public Gymnast(){

    }

    public Gymnast (String fullName, int age, String country, int height, int weight, String style){
        super(fullName, age, country);
        this.height = height;
        this.weight = weight;
        this.style = style;
    }

    public void play(){
        System.out.println("Gymnast doing exercises");
    }
}