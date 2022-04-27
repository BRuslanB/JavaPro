package Lesson_Pr_11_1;

public class Main {
    public static void main(String[] args) {
        Runnable runnable1 = new Runnable(){
            @Override
            public void run() {
                System.out.println("RUN use in abstract class");
            }
        };

        Runnable runnable2 = () -> System.out.println("RUN use in Lambda");
        runnable1.run();
        runnable2.run();
    }
}