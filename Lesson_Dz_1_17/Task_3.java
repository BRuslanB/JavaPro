package Lesson_Dz_1_17;

import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(count_letter(s));
    }
    public static int count_letter(String s1){
        int sum=0;
        s1=s1.toLowerCase();
        for (int i=0; i<s1.length(); i++)
            if (s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
                sum++;
        return sum;
    }
}