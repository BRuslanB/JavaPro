package Lesson_Dz_1_17;

import java.util.Scanner;
public class Task_11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] mas = new String[n];
        for (int i=0;i<n; i++)
            mas[i] = in.next();
        String s = in.next();
        System.out.println(incude_string(mas,s));
    }
    public static String incude_string(String[] mas1, String s1){
        for (int i=0; i<mas1.length; i++)
            if (mas1[i].indexOf(s1) !=-1)
                return "YES";
        return "NO";
    }
}