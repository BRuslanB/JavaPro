package Lesson_Dz_1_17;

import java.util.Scanner;
public class Task_13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mas = new int[n];
        for (int i=0;i<n; i++)
            mas[i] = in.nextInt();
        int m = in.nextInt();
        change_sum(mas,m);
    }
    public static void change_sum(int[] mas1, int m1){
        int sum=0;
        for (int i=0; i<mas1.length;i++)
            sum+=mas1[i];
        for (int i=0; i<mas1.length;i++) {
            if (mas1[i] > m1)
                mas1[i] = sum;
            System.out.print(mas1[i] + " ");
        }
    }
}