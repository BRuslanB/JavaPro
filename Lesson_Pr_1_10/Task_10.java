package Lesson_Pr_1_10;

import java.util.Scanner;
public class Task_10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mas = new int[n];
        for (int i=0;i<n; i++) {
            mas[i] = in.nextInt();
        }
        System.out.println(sum_not_five(mas));
    }
    public static int sum_not_five(int[] mas1){
        int sum=0;
        for (int i=0; i<mas1.length;i++)
            if (mas1[i]%5!=0)
                sum+=mas1[i];
        return sum;
    }
}