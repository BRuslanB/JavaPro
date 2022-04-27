/*      3) Create class Person with fields: String name, String surname, int age
        Create ArrayList of Person objects.
        Add some objects to arraylist
        a) Create stream and map to getName(). Sort them and show results
        b) Create stream and map to getAge(). Filter with condition(age >= 18). Show results of integers

        4) Continue with Person class
        a) Create stream and flatMap to getName and getAge. Show results to the screen
        b) Create stream and flatMap to getName and getAge. Sort according to age in ascending order. Show results

        5) Continue with Person class
        Create map and add to that map using stream name as key and age as value. Show results of map using Map.Entry
 */

package Lesson_Pr_12_3and4and5;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class Main {

    static class Person{
        String name;
        String surname;
        int age;

        Person (String name, String surname, int age){
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main (String[] arg){
        ArrayList<Person> personArrayList = new ArrayList<>();
        Collections.addAll(personArrayList,
                new Person("Arlan", "Birzhanov", 14),
                new Person("Timur", "Birzhanov", 21),
                new Person("Ruslan", "Bars", 32),
                new Person("Aliya", "Bars", 29),
                new Person("An", "Astory", 40),
                new Person("Aray", "Palin", 33));
        //Stream<Person> stream = personArrayList.stream();

        System.out.println("Task 3 a)");
        personArrayList.stream()
            .map(personList -> personList.getName())
            .forEach(personList -> System.out.println(personList));

        System.out.println("Task 3 b)");
        personArrayList.stream()
                .map(personList -> personList.getAge())
                .filter(x -> x >= 18)
                .forEach(personList -> System.out.println(personList));

        System.out.println("Task 4 a)");
        personArrayList.stream()
                .flatMap(item -> Stream.of(item.getName() + " " + item.getAge()))
                .forEach(System.out::println);

        System.out.println("Task 4 b)");
        personArrayList.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .flatMap(item -> Stream.of(item.getName() + " " + item.getAge()))
                .forEach(System.out::println);

        System.out.println("Task 5)");
        // Получаем набор элементов
        Map personMap = (Map) personArrayList.stream()
                //.flatMap(item -> Stream.of(item.getName(), item.getAge()))
                .collect(toMap(e -> e.getName(), e -> e.getAge()));
        // Получаем набор элементов
        Set personSet = personMap.entrySet();
        // Получаем итератор
        Iterator i = personSet.iterator();
        // Отображение элементов
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.println(me.getKey() + ": " + me.getValue());
        }
    }
}