package Lesson_Dz_1_17;

import java.util.Scanner;
public class Task_17 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mas = new int[n];
        for (int i=0;i<n; i++)
            mas[i] = in.nextInt();
        int m = in.nextInt();
        choose(mas,m);
    }
    public static void choose(int[] mas1, int m1){
        for (int i=0; i<mas1.length;i++)
            if (mas1[i] == i && mas1[i]%m1 !=0)
                System.out.println(mas1[i]);
    }
}