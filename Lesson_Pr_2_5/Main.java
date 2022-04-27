package Lesson_Pr_2_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] Students = new Student[10];
        Students[0] = new Student(1, "Иван", "Иванов", 2.3);
        Students[1] = new Student(2, "Петр", "Петров", 3.3);
        Students[2] = new Student(3, "Ахмет", "Ахметов", 4.0);
        Students[3] = new Student(4, "Семен", "Семенов", 2.5);
        Students[4] = new Student(5, "Максим", "Максимов", 3.5);
        Students[5] = new Student(6, "Наталья", "Климова", 3.2);
        Students[6] = new Student(7, "Мария", "Кузнецова", 3.7);
        Students[7] = new Student(8, "Яна", "Шмидт", 3.9);
        Students[8] = new Student(9, "Борис", "Добронравов", 2.8);
        Students[9] = new Student(10, "Светлана", "Шолохова", 3.6);
        System.out.println(topStudent(Students).getStudentData());
    }

    public static Student topStudent(Student students[]) {
        double max_gpa = students[0].getGPA();
        int max_i = 0;
        for (int i = 1; i < 10; i++)
            if (students[i].getGPA() > max_gpa) {
                max_gpa = students[i].getGPA();
                max_i = i;
            }
        return students[max_i];
    }
}