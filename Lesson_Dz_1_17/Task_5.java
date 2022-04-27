package Lesson_Dz_1_17;

import java.util.Scanner;
public class Task_5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mas = new int[n];
        for (int i=0;i<n; i++) {
            mas[i] = in.nextInt();
        }
        uniq_mas(mas);
    }
    public static void uniq_mas(int[] mas1){
        boolean f;
        for (int i=0; i<mas1.length;i++) {
            f = true;
            for (int j = 0; j < mas1.length; j++)
                if (mas1[i] == mas1[j] && i!=j) {
                    f = false;
                    break;
                }
            if (f)
                System.out.print(mas1[i]+" ");
        }
    }
}