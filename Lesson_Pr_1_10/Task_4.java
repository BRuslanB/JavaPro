package Lesson_Pr_1_10;

import java.util.Scanner;
public class Task_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        System.out.println(polindrom(a));
    }
    public static String polindrom(String c){
        for (int i=0; i<c.length()/2; i++)
            if (c.charAt(i)!=c.charAt(c.length()-1-i))
                return "NO";
        return "YES";
    }
}