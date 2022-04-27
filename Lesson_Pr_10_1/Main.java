package Lesson_Pr_10_1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static final int COUNT_PLAYERS = 10;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList <Players> players = new ArrayList<>();

        String name;
        double price, average_price = 0;
        int age, sum_age = 0;

        for (int i=0; i<COUNT_PLAYERS; i++){
            System.out.println("Введите имя " + (i + 1) + "-го игрока");
            name = in.next();
            try {
                System.out.println("Введите стоимость " + (i + 1) + "-го игрока");
                price = in.nextDouble();
            } catch (InputMismatchException e){
                price = 0;
                in.next();
            }
            try{
                System.out.println("Введите возраст " + (i + 1) + "-го игрока");
                age = in.nextInt();
            } catch (InputMismatchException e){
                age = 0;
                in.next();
            }
            players.add(new Players(name, price, age));
        }

        for (int i=0; i<players.size(); i++){
            average_price =average_price + players.get(i).getPrice();
            sum_age = sum_age + players.get(i).getAge();
        }
        System.out.println("Среднее значение цены: " + average_price / players.size());
        System.out.println("Сумма возраста игроков: " + sum_age);
    }
}