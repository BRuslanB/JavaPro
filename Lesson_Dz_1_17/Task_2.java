package Lesson_Dz_1_17;

import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(double_letter(s));
    }
    public static String double_letter(String s1){
        String s2="";
        for (int i=0; i<s1.length(); i++)
            s2=s2+ Character.toString(s1.charAt(i))+Character.toString(s1.charAt(i));
        return s2;
    }
}