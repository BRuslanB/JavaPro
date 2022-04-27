package Lesson_Pr_5_3;

public class Main {
    public static void main(String[] args){
        FerrariEngine ferrariEngine1 = new FerrariEngine(4.5, 8, 20);
        FerrariEngine ferrariEngine2 = new FerrariEngine(5,12,25);
        FerrariEngine ferrariEngine3 = new FerrariEngine(5.2, 10, 22);
        FerrariEngine ferrariEngine4 = new FerrariEngine(5.5, 12,25);
        FerrariEngine ferrariEngine5 = new FerrariEngine(6.0, 16, 30);

        RenaultEnigine renaultEnigine1 = new RenaultEnigine(3.2,4,12,2.0);
        RenaultEnigine renaultEnigine2 = new RenaultEnigine(3.0,6,15,1.2);
        RenaultEnigine renaultEnigine3 = new RenaultEnigine(3.5, 8,18,2.2);
        RenaultEnigine renaultEnigine4 = new RenaultEnigine(2.8, 8, 20,3.0);
        RenaultEnigine renaultEnigine5 = new RenaultEnigine(4.0, 12, 25,3.2);

        Engine[] engines = {ferrariEngine1, ferrariEngine2, ferrariEngine3, ferrariEngine4, ferrariEngine5,
                            renaultEnigine1, renaultEnigine2, renaultEnigine3, renaultEnigine4, renaultEnigine5};

        double max_vol_ferrari = engines[0].getMaxSpeed(), max_vol_renault = engines[0].getMaxSpeed();
        for (int i = 1; i < engines.length; i++) {
            //System.out.println(engines[i].getMaxSpeed());
            if (engines[i] instanceof FerrariEngine) {
                if (engines[i].getMaxSpeed() > max_vol_ferrari)
                    max_vol_ferrari = engines[i].getMaxSpeed();
            } else if (engines[i].getMaxSpeed() > max_vol_renault) {
                max_vol_renault = engines[i].getMaxSpeed();
            }
        }
        System.out.println("Max speed Ferrari: " + max_vol_ferrari + "\n" +
                           "Max speed Renault: " + max_vol_renault);
    }
}