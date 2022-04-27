package Lesson_Pr_1_10;

import java.util.Scanner;
public class Task_5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        System.out.println(include(s1,s2));
    }
    public static String include(String c1, String c2){
        if (c1.indexOf(c2) ==-1)
            return "NO";
        return "YES";
    }
}