package Lesson_Pr_2_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone[] Phones = new Phone[5];
        Phones[0] = new Phone("Samsung", "S20", 230000);
        Phones[1] = new Phone("Samsung", "S21", 280000);
        Phones[2] = new Phone("IPone", "13", 550000);
        Phones[3] = new Phone("Nokia", "3031", 100000);
        Phones[4] = new Phone("Motorola", "A1", 300000);
        for (int i=0; i<5; i++)
            System.out.println(Phones[i].getData());
    }
}