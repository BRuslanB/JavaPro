package Lesson_Dz_1_17;

import java.util.Scanner;
public class Task_7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        char s = in.next().charAt(0);
        System.out.println(calc(a,b,s));
    }
    public static int calc(int x, int y, char oper){
        switch (oper){
            case '+':
                return x+y;
            //break;
            case '-':
                return x-y;
            //break;
            case '*':
                return x*y;
            //break;
            case '/':
                return x / y;
            //break;
        }
        return 0;
    }
}