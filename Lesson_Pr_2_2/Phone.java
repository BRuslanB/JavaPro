package Lesson_Pr_2_2;

public class Phone {
    private String name;
    private String model;
    private int price;

    public Phone (){
    }

    public Phone(String name, String model, int price){
        this.name=name;
        this.model=model;
        this.price=price;
    }

    public String getData(){
        return "Name: " +name+ ", Model: " +model+ ", Price: " +price;
    }
}