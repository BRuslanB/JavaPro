package Lesson_Pr_1_10;

import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char a = in.next().charAt(0);
        System.out.println(count(s.toLowerCase(),a));
    }
    public static int count(String s1, char a1){
        int sum=0;
        for (int i=0; i<s1.length(); i++){
            if (s1.charAt(i)==a1) sum++;
        }
        return sum;
    }
}