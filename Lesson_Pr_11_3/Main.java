package Lesson_Pr_11_3;

public class Main {
    public static void main (String[] args){
        Supplier supplier1 = new Supplier() {
            @Override
            public int get() {
                System.out.print("Use abstract class - ");
                return 0;
            }
        };

        Supplier supplier2 = () -> {
            System.out.print("Use Lambda - ");
            return 1;
        };
        System.out.println(supplier1.get());
        System.out.println(supplier2.get());
    }
}