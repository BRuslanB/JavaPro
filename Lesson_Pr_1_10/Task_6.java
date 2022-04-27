package Lesson_Pr_1_10;

import java.util.Scanner;
public class Task_6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        System.out.println(check(s1,s2));
    }
    public static String check(String c1, String c2){
        String l="admin";
        String p="qwerty";
        try {
            for (int i=0; i<c1.length();i++)
                if (c1.charAt(i)!=l.charAt(i))
                    return "Invalid login or password";
            for (int i=0; i<c2.length();i++)
                if (c2.charAt(i)!=p.charAt(i))
                    return "Invalid login or password";
        }
        catch(ArrayIndexOutOfBoundsException ex) {
            return "Invalid login or password";
        }
        return "Authentication completed";
    }
}