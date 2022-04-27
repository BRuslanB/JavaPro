package Lesson_Pr_4_1and2;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Lada", "Granta", 180, 2020, 1.8);
        Car c2 = new Car("Nissan", "X Trail", 240, 2016, 2.5);
        Car c3 = new Car("Honda", "CRV", 200, 1998, 2);

        Mercedes m1 = new Mercedes("Mercedes Benz", "E 230", 220, 2002, 2.3, "E class");
        Mercedes m2 = new Mercedes("Mercedes ML", "M 300", 260, 2010, 3, "M class");
        Mercedes m3 = new Mercedes("Mercedes G", "G 440", 320, 2016, 3.2, "G class");

        Toyota t1 = new Toyota("Toyota Camry", "V70", 240, 2021, 2.5, "Japan");
        Toyota t2 = new Toyota("Toyota Prado", "150", 260, 2020, 2.7, "Japan");
        Toyota t3 = new Toyota("Toyota Avensis", "40", 220, 2000, 2, "Europe");

        Car cars[] = {c1, c2, c3, m1, m2, m3, t1, t2, t3};

        for (int i = 0; i < cars.length; i++)
            cars[i].ride();
    }
}
