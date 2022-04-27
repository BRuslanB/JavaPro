package Lesson_Pr_3_3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Phone[] Phones = new Phone[10];
        Phones[0] = new Phone("Samsung", "S20", 230000, 256);
        Phones[1] = new Phone("Samsung", "S21", 280000,128);
        Phones[2] = new Phone("IPone", "13", 550000,128);
        Phones[3] = new Phone("Nokia", "3031", 100000,16);
        Phones[4] = new Phone("Motorola", "F1", 300000,32);
        Phones[5] = new Phone("OPPO", "A15", 80000,64);
        Phones[6] = new Phone("Vivo", "V1", 700000,512);
        Phones[7] = new Phone("Huawei", "P40", 320000,32);
        Phones[8] = new Phone("Xiaomi", "Redmi 9A", 250000,64);
        Phones[9] = new Phone("ZTE", "A51", 350000,128);
        for (int i=0; i<10; i++)
            System.out.println(Phones[i].getCategory());
    }
}