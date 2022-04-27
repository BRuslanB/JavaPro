package Lesson_Dz_1_17;

import java.util.Scanner;
public class Task_14 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mas = new int[n];
        for (int i=0;i<n; i++) {
            mas[i] = in.nextInt();
        }
        swap_min_max_mas(mas);
    }
    public static void swap_min_max_mas(int[] mas1){
        int min=mas1[0];
        int max=mas1[0];
        int max_i=0;
        int min_i=0;
        int temp;
        for (int i=0; i<mas1.length;i++) {
            if (mas1[i] > max) {
                max = mas1[i];
                max_i = i;
            }
            if (mas1[i] < min) {
                min = mas1[i];
                min_i = i;
            }
        }
        temp=mas1[max_i];
        mas1[max_i]=mas1[min_i];
        mas1[min_i]=temp;
        for (int i=0; i<mas1.length;i++)
            System.out.print(mas1[i]+" ");
    }
}