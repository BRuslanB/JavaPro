package Lesson_Pr_5_2;

public class Main {
    public static void main(String[] args) {
        SphereGold sphereGold1 = new SphereGold(10);
        SphereGold sphereGold2 = new SphereGold(12);
        SphereGold sphereGold3 = new SphereGold(8);

        CubeGold cubeGold1 = new CubeGold(3.2);
        CubeGold cubeGold2 = new CubeGold(4.5);
        CubeGold cubeGold3 = new CubeGold(5.5);

        GoldShape[] goldShapes = {sphereGold1, sphereGold2, sphereGold3, cubeGold1, cubeGold2, cubeGold3};

        double vol;
        for (int i = 0; i < goldShapes.length; i++) {
            vol = goldShapes[i].getVolume();
            System.out.println(goldShapes[i].getPrice(vol));
        }
    }
}