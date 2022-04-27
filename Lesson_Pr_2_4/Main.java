package Lesson_Pr_2_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Иван", "Иванов", 2.3);
        Student s2 = new Student(2, "Петр", "Петров", 3.3);
        Student s3 = new Student(3, "Ахмет", "Ахметов", 4.0);
        Student s4 = new Student(4, "Семен", "Семенов", 2.5);
        Student s5 = new Student(5, "Максим", "Максимов", 3.5);
        Student[] Students = new Student[5];
        Students[0] = s1;
        Students[1] = s2;
        Students[2] = s3;
        Students[3] = s4;
        Students[4] = s5;

        for (int i=0; i<5; i++)
            System.out.println(Students[i].getStudentData());
    }
}