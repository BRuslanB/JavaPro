package Lesson_Pr_5_2;

public class SphereGold extends GoldShape{
    double radius;

    public SphereGold (){

    }

    public SphereGold(double radius){
        this.radius = radius;
    }

    public double getVolume(){
        return 4/3 * Math.PI * Math.pow(radius, 3);
    }
}