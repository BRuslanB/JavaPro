package Lesson_Dz_1_17;

import java.util.Scanner;
public class Task_16 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(calc(a,b));
    }
    public static int calc(int x, int y){
        if (x%2==0 && y%2==0)
            return x*y;
        else if (x%2!=0 && y%2!=0)
            return x+y;
        else if (x%2!=0 && y%2==0)
            return x;
        else if (x%2==0 && y%2!=0)
            return y;
        return 0;
    }
}