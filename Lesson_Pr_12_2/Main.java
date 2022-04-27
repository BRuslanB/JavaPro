/* 2) Create ArrayList<String>
   Add some strings to arraylist
   Filter stream with condition(s.length() > 3 && s.startsWith("A"))
   Sort stream and show result
 */

package Lesson_Pr_12_2;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Arlan");
        strings.add("Timur");
        strings.add("Ruslan");
        strings.add("Aliya");
        strings.add("An");
        strings.add("array");

        Stream<String> stream = strings.stream();
        stream.filter(s -> s.length() > 3 && s.startsWith("A")).sorted().forEach(s -> System.out.println(s));
    }
}