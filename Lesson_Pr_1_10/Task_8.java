package Lesson_Pr_1_10;

import java.util.Scanner;
public class Task_8 {
    private static int n;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[][] mas = new int[n][n];
        for (int i=0;i<n; i++)
            for (int j=0;j<n; j++)
                mas[i][j] = in.nextInt();
        swap(mas);
        for (int i=0;i<n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(mas[i][j] + " ");
            System.out.println();
        }
    }
    public static void swap(int[][] mas1){
        int k;
        for (int i=0; i<n;i++) {
            k = mas1[0][i];
            mas1[0][i]=mas1[n-1][i];
            mas1[n-1][i]=k;
        }
    }
}