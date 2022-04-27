/* 1) Create ArrayList<Integer>
   Add some numbers to arraylist
   Count how many numbers that are divisible by 3 using Stream methods
   Show number of count
 */

package Lesson_Pr_12_1;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(43);
        numbers.add(45);
        numbers.add(23);
        numbers.add(40);
        numbers.add(24);

        Stream <Integer> stream = numbers.stream();
        //long t = stream.filter(n -> n%3 == 0).count();
        //System.out.println("Count = " + t);
        System.out.println("Count = " + stream.filter(n -> n%3 == 0).count());
    }
}