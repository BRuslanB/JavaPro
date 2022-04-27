package Lesson_Pr_5_1;

public abstract class Food {
    String name;

    public abstract double getCalories();

    public Food() {

    }

    public Food(String name) {
        this.name = name;
    }
}