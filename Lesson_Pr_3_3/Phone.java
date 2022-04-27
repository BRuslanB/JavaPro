package Lesson_Pr_3_3;

public class Phone {
    private String name;
    private String model;
    private int price;
    private int memory;

    public Phone(){
    }

    public Phone(String name, String model, int price, int memory){
        this.name = name;
        this.model = model;
        this.price = price;
        this.memory = memory;
    }

    public String getName(){
        return name;
    }

    public String getModel(){
        return model;
    }

    public int getPrice(){
        return price;
    }

    public int getMemory(){
        return memory;
    }

    public void setName(){
        this.name = name;
    }

    public void setModel(){
        this.model = model;
    }

    public void setPrice(){
        this.price = price;
    }

    public void setMemory(){
        this.memory = memory;
    }

    public String getCategory(){
        int kurs = 525;
        if (price/kurs>1000) return name + " ТОП";
        else if (price/kurs<=1000 && price/kurs>=500) return name + " MEDIUM";
        return name + " SIMPLE";
    }
}