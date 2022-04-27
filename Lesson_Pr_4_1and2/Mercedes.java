package Lesson_Pr_4_1and2;

public class Mercedes extends Car{
    String classType;

    public Mercedes(){

    }

    public Mercedes (String name, String model, int maxSpeed, int year, double volume, String classType){
        super(name, model, maxSpeed, year,volume);
        this.classType = classType;
    }
    public void ride(){
        System.out.println("Mercedes is riding");
    }
}