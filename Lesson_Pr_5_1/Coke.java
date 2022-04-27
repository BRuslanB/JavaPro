package Lesson_Pr_5_1;

public class Coke extends Food {
    double volumeLiters;
    boolean isSparkling; // Газированная или нет

    public Coke(){

    }

    public Coke(String name, double volumeLiters, boolean isSparkling ){
        super(name);
        this.volumeLiters = volumeLiters;
        this.isSparkling = isSparkling;
    }

    public double getCalories(){
        return isSparkling ? volumeLiters * 400 : volumeLiters * 100;
    }
}