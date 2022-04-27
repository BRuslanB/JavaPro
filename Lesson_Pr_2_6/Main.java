package Lesson_Pr_2_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("PRESS [1] TO ADD STUDENT");
        System.out.println("PRESS [2] TO LIST STUDENT");
        System.out.println("PRESS [0] TO EXIT");
        Student[] Students = new Student[100];
        int count_students = 0;
        Scanner in = new Scanner(System.in);
        char x;
        String name = "";
        String surname = "";
        double gpa = 0;
        do {
            x = in.next().charAt(0);
            switch (x) {
                case '1':
                    try {
                        System.out.println("Insert name?");
                        name = in.next();
                        System.out.println("Insert surname?");
                        surname = in.next();
                        System.out.println("Insert GPA?");
                        gpa = in.nextDouble();
                        count_students++;
                        Students[count_students - 1] = new Student(count_students, name, surname, gpa);
                        System.out.println("PRESS [1] OR [2] OR [0]");
                        break;
                    } catch (Exception ex) {
                        System.out.println("Data entry error");
                        x = '0';
                        break;
                    }
                case '2':
                    if (count_students == 0)
                        System.out.println("Student list is empty");
                    else
                        for (int i = 0; i < count_students; i++)
                            System.out.println(Students[i].getStudentData());
                    System.out.println("PRESS [1] OR [2] OR [0]");
                    break;
                case '0':
                    System.out.println("Program completed");
                    break;
                default:
                    System.out.println("PRESS [1] OR [2] OR [0]");
                    break;
            }
        } while (x != '0');
    }
}