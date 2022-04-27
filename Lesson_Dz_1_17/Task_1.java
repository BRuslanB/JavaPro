package Lesson_Dz_1_17;

import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(chech_div_2(n));
    }
    public static String chech_div_2(int a){
        if (a%2==0)
            return "YES";
        return "NO";

    }
}