package Lesson_Dz_1_17;

import java.util.Scanner;
public class Task_8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] mas = new int[n][m];
        for (int i=0;i<n; i++)
            for (int j=0;j<m; j++)
                mas[i][j] = in.nextInt();
        max_mas(mas);
    }
    public static void max_mas(int[][] mas1){
        int max;
        for (int i=0; i<mas1.length;i++) {
            max=mas1[i][0];
            for (int j=1; j<mas1[i].length;j++)
                if (mas1[i][j] > max)
                    max = mas1[i][j];
            System.out.println(max);
        }
    }
}