package Lesson_Dz_1_17;

import java.util.Scanner;
public class Task_9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mas = new int[n];
        for (int i=0;i<n; i++) {
            mas[i] = in.nextInt();
        }
        choose_mas(mas);
    }
    public static void choose_mas(int[] mas1){
        for (int i=0; i<mas1.length;i++)
            if (mas1[i]<50 && mas1[i]%5==0)
                System.out.println(mas1[i]);
    }
}