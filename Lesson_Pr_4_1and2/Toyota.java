package Lesson_Pr_4_1and2;

public class Toyota extends Car {
    String manufacturer;

    public Toyota(){

    }

    public Toyota (String name, String model, int maxSpeed, int year, double volume, String manufacturer){
        super(name, model, maxSpeed, year,volume);
        this.manufacturer = manufacturer;
    }
    public void ride(){
        System.out.println("Toyota is riding");
    }
}