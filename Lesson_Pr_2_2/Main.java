package Lesson_Pr_2_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone("Samsung", "S20", 230000);
        Phone p2 = new Phone("Samsung", "S21", 280000);
        Phone p3 = new Phone("IPone", "13", 550000);
        Phone p4 = new Phone("Nokia", "3031", 100000);
        Phone p5 = new Phone("Motorola", "A1", 300000);
        System.out.println(p1.getData());
        System.out.println(p2.getData());
        System.out.println(p3.getData());
        System.out.println(p4.getData());
        System.out.println(p5.getData());
    }
}