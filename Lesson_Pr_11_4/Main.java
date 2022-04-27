package Lesson_Pr_11_4;

public class Main {
    static int y = 5;

    public static void main(String[] args){
        Consumer consumer1 = new Consumer() {
            @Override
            public int apply(int x) {
                y = 2 * y;
                return x * y;
            }
        };

        Consumer consumer2 = x -> x * y;
        System.out.print("Use abstract class - ");
        System.out.println(consumer1.apply(5));
        System.out.print("Use Lambda - ");
        System.out.println(consumer2.apply(5));
    }
}