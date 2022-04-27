package Lesson_Pr_5_1;

public class Chocolate extends Food{
    int weight;

    public Chocolate(){

    }

    public Chocolate(String name, int weight){
        super(name);
        this.weight = weight;
    }

    public double getCalories(){
        return weight * 740;
    }
}