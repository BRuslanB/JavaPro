package Lesson_Pr_1_10;

import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(max(a,b,c));
    }
    public static int max(int a, int b, int c){
        if (a>b&&a>c) return a;
        if (c>a&&c>b) {
            return c;
        }else {
            return b;
        }
    }
}