package Lesson_Pr_1_10;

import java.util.Scanner;
public class Task_9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mas = new int[n];
        for (int i=0;i<n; i++) {
            mas[i] = in.nextInt();
        }
        print_odd(mas);
    }
    public static void print_odd(int[] mas1){
        for (int i=0; i<mas1.length;i++)
            if (mas1[i]%2!=0)
                if (mas1[i]!=23)
                    System.out.println(mas1[i]);
                else
                    break;
    }
}