package Lesson_Pr_5_3;

public abstract class Engine {
    double engineVolume;
    int cylinderAmount;
    double engineWeight;

    public abstract double efficiency();

    public abstract double throttleEnergy();

    public abstract double breakEnergy();

    public Engine(){

    }

    public Engine(double engineVolume, int cylinderAmount, double engineWeight){
        this.engineVolume = engineVolume;
        this.cylinderAmount = cylinderAmount;
        this.engineWeight = engineWeight;
    }

    public double getEngineVolume(){
        return engineVolume;
    }

    public int getCylinderAmount(){
        return cylinderAmount;
    }

    public double getEngineWeight(){
        return engineWeight;
    }

    public void setEngineVolume(){
        this.engineWeight = engineWeight;
    }

    public void setCylinderAmount(){
        this.cylinderAmount = cylinderAmount;
    }

    public void setEngineWeight(){
        this.engineWeight = engineWeight;
    }

    public double getMaxSpeed(){
        return (throttleEnergy()-breakEnergy())*efficiency();
    }
}