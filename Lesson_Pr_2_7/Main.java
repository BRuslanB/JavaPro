package Lesson_Pr_2_7;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int COUNT_CLUB = 2;
        final int COUNT_PLAYERS = 5;

        Player[] players1 = new Player[COUNT_PLAYERS];
        players1[0] = new Player(1, "Иван", "Иванов", "23");
        players1[1] = new Player(2, "Петр", "Петров", "33");
        players1[2] = new Player(3, "Ахмет", "Ахметов", "40");
        players1[3] = new Player(4, "Семен", "Семенов", "25");
        players1[4] = new Player(5, "Максим", "Максимов", "35");

        Player[] players2 = new Player[COUNT_PLAYERS];
        players2[0] = new Player(1, "Jon", "Smit", "7");
        players2[1] = new Player(2, "Saimon", "Dzhuzepe", "5");
        players2[2] = new Player(3, "Philip", "Moris", "8");
        players2[3] = new Player(4, "Metew", "O'Donel", "9");
        players2[4] = new Player(5, "Bil", "Klinton", "2");

        Club Club1 = new Club("Kairat", "Kazhakstan", 10, players1);
        Club Club2 = new Club("Barselona", "Spain", 90, players2);

        Club[] mas_club = new Club[COUNT_CLUB];
        mas_club[0] = Club1;
        mas_club[1] = Club2;

        for (int i=0; i<COUNT_CLUB; i++)
            mas_club[i].printClubData();
    }
}