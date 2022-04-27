package Lesson_Pr_5_2;

public abstract class GoldShape {

    public abstract double getVolume();

    public GoldShape() {

    }

    public double getPrice(double volume){
        return volume * 250 + 1200;
    }
}