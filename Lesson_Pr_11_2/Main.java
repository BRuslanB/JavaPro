package Lesson_Pr_11_2;

public class Main {
    static int y = 10;

    public static void main(String[] args){
        Consumer consumer1 = new Consumer() {
            public void accept(int x) {
                System.out.println("Print via abstract class - " + (x +y));;
            }
        };

        Consumer consumer2 = x -> System.out.println("Print via Lambda - " + (x + y));
        consumer1.accept(5);
        consumer2.accept(10);
    }
}