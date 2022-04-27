package Lesson_Pr_1_10;

import java.util.Scanner;
public class Task_7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mas = new int[n];
        for (int i=0;i<n; i++) {
            mas[i] = in.nextInt();
        }
        System.out.println(average_even(mas));
    }
    public static int average_even(int[] mas1){
        int sum=0;
        int k=0;
        for (int i=0; i<mas1.length;i++)
            if (mas1[i]%2==0) {
                sum+=mas1[i];
                k++;
            }
        return sum/k;
    }
}