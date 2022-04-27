package Lesson_Pr_5_1;

public class Main {
    public static void main(String[] args) {
        Chocolate chocolate1 = new Chocolate("Snickers", 130);
        Chocolate chocolate2 = new Chocolate("Twix", 180);

        Coke coke1 = new Coke("Coca Cola", 0.5, true);
        Coke coke2 = new Coke("Fuse Tea", 1, false);

        Burger burger1 = new Burger("Burger King", 100, 1);
        Burger burger2 = new Burger("McDonalds", 120, 2);

        Food[] foods = {chocolate1, chocolate2, coke1, coke2, burger1, burger2};

        int i_max = 0;
        double max_calories = foods[i_max].getCalories();

        for (int i = 0; i < foods.length; i++) {
            System.out.println("Name: " + foods[i].name + ", Calories: " + foods[i].getCalories());
            if (foods[i].getCalories() > max_calories) {
                max_calories = foods[i].getCalories();
                i_max = i;
            }
        }
        System.out.println("----------------" + "\n" + "Name: " + foods[i_max].name + ", Calories: " + foods[i_max].getCalories());
    }
}
