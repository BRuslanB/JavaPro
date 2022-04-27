package Lesson_Dz_1_17;

import java.util.Scanner;
public class Task_6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mas = new int[n];
        for (int i=0;i<n; i++) {
            mas[i] = in.nextInt();
        }
        min_max_mas(mas);
    }
    public static void min_max_mas(int[] mas1){
        int min=mas1[0];
        int max=mas1[0];
        for (int i=0; i<mas1.length;i++) {
            if (mas1[i] > max)
                max = mas1[i];
            if (mas1[i] < min)
                min = mas1[i];
        }
        System.out.print(min+"\n"+max);
    }
}