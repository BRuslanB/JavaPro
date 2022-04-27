package Lesson_Pr_10_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static final int COUNT_ACCOUNTS = 10;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BankApplication b1 = new BankApplication();
        BankApplication b2 = new BankApplication();
        BankApplication b3 = new BankApplication();

        String name;
        String surname;
        double balance;

        ArrayList<BankApplication> allBanks = new ArrayList<>();
        allBanks.add(b1);
        allBanks.add(b2);
        allBanks.add(b3);

        for (int i=0; i<allBanks.size(); i++){
            System.out.println("Введите название " + (i + 1) + "-го банка: ");
            allBanks.get(i).name = in.next();
            for (int j=0; j<COUNT_ACCOUNTS; j++) {
                System.out.println("Input account Name: ");
                name = in.next();
                System.out.println("Input account SurName: ");
                surname = in.next();
                try {
                    System.out.println("Input account Balance: ");
                    balance = in.nextDouble();
                } catch (InputMismatchException e) {
                    balance = 0;
                    in.next();
                }
                allBanks.get(i).addAccount(new Account(i, name, surname, balance));
            }
        }
        Collections.sort(allBanks);
        for (int i=0; i<allBanks.size(); i++){
            System.out.println(allBanks.get(i).getBankData());
        }
    }
}