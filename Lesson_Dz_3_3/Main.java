package Lesson_Dz_3_3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        PhoneProcessor[] PhoneProcessors = new PhoneProcessor[5];
        PhoneProcessors[0] = new PhoneProcessor("S20_Processor", 16, 115000);
        PhoneProcessors[1] = new PhoneProcessor("A15_Processor", 6, 40000);
        PhoneProcessors[2] = new PhoneProcessor("I13_Processor", 8, 225000);
        PhoneProcessors[3] = new PhoneProcessor("N30_Processor", 2, 50000);
        PhoneProcessors[4] = new PhoneProcessor("M1_Processor", 4, 15000);

        PhoneMemory[] PhoneMemories = new PhoneMemory[5];
        PhoneMemories[0] = new PhoneMemory("S20_Memory", 256, 115000);
        PhoneMemories[1] = new PhoneMemory("A15_Memory", 256, 40000);
        PhoneMemories[2] = new PhoneMemory("I13_Memory", 256, 225000);
        PhoneMemories[3] = new PhoneMemory("N30_Memory", 256, 50000);
        PhoneMemories[4] = new PhoneMemory("M1_Memory", 256, 15000);

        SmartPhone[] SmartPhones = new SmartPhone[5];
        SmartPhones[0] = new SmartPhone("Samsung", "S20", PhoneProcessors[0], PhoneMemories[0]);
        SmartPhones[1] = new SmartPhone("OPPO", "A15", PhoneProcessors[1], PhoneMemories[1]);
        SmartPhones[2] = new SmartPhone("IPone", "I13", PhoneProcessors[2], PhoneMemories[2]);
        SmartPhones[3] = new SmartPhone("Nokia", "N30", PhoneProcessors[3], PhoneMemories[3]);
        SmartPhones[4] = new SmartPhone("Motorola", "M1", PhoneProcessors[4], PhoneMemories[4]);

        SmartPhone temp = new SmartPhone();
        for (int i = 0; i < 5; i++)
            for (int j = i+1; j < 5; j++)
                if (SmartPhones[i].getPrice() > SmartPhones[j].getPrice()) {
                    temp = SmartPhones[i];
                    SmartPhones[i] = SmartPhones[j];
                    SmartPhones[j] = temp;
                }
        for (int i = 0; i < 5; i++) {
            System.out.println(SmartPhones[i].toString());
        }
    }
}