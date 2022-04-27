package Lesson_Dz_1_17;

import java.util.Scanner;
public class Task_10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(season(a));
    }
    public static String season(int x){
        switch (x){
            case 1:
            case 2:
            case 12:
                return "Winter";
            case 3:
            case 4:
            case 5:
                return "Spring";
            case 6:
            case 7:
            case 8:
                return "Summer";
            case 9:
            case 10:
            case 11:
                return "Autumn";
        }
        return "";
    }
}