package Lesson_Pr_1_10;

import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(triangle(a,b,c));
    }
    public static String triangle(int a, int b, int c){
        if ((a<b+c && b<a+c) && (b<a+c && c<a+b) && (c<a+b && a<b+c))
            return "YES";
        return "NO";
    }
}