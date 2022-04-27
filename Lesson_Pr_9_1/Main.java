package Lesson_Pr_9_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        User[] users = new User[5];
        Scanner in = new Scanner(System.in);
        String name, surname;
        int age;
        int sum = 0;
        for (int i=0; i<users.length; i++){
            System.out.println("Введите имя:");
            name = in.next();
            System.out.println("Введите фамилию:");
            surname = in.next();
            try{
                System.out.println("Введите возраст:");
                age = in.nextInt();
            }catch (InputMismatchException e){
                age = 0;
                in.next();
            }
            users[i] = new User(name, surname, age);;
            sum = sum + age;
        }
        System.out.println("Средний возраст: " + sum/users.length);
    }
}