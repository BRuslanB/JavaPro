package Lesson_Dz_3_3;

public class PhoneMemory {
    private String name;
    private int totalMemory;
    private int price;


    public PhoneMemory(){
    }

    public PhoneMemory(String name, int totalMemory,int price){
        this.name = name;
        this.totalMemory = totalMemory;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getTotalMemory(){
        return totalMemory;
    }

    public int getPrice(){
        return price;
    }

    public void setName(){
        this.name = name;
    }

    public void setTotalMemory(){
        this.totalMemory = totalMemory;
    }

    public void setPrice(){
        this.price = price;
    }
}