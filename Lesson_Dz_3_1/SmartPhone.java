package Lesson_Dz_3_1;

public class SmartPhone {
    private String name;
    private String model;
    private PhoneProcessor processor;
    private PhoneMemory memory;

    public SmartPhone(){
    }

    public SmartPhone(String name, String model, PhoneProcessor processor, PhoneMemory memory){
        this.name = name;
        this.model = model;
        this.processor = processor;
        this.memory = memory;
    }

    public String getName(){
        return name;
    }

    public String getModel(){
        return model;
    }

    public PhoneProcessor getProcessor(){
        return processor;
    }

    public PhoneMemory getMemory(){
        return memory;
    }

    public void setName(){
        this.name = name;
    }

    public void setModel(){
        this.model = model;
    }

    public void setProcessor(){
        this.processor = processor;
    }

    public void setMemory(){
        this.memory = memory;
    }

    public int getPrice(){
        return processor.getPrice() + memory.getPrice();
    }
}