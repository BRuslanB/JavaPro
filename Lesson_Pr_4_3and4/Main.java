package Lesson_Pr_4_3and4;

public class Main {
    public static void main(String[] args) {
        Gymnast g1 = new Gymnast("Иванов", 22, "Россия", 180, 76, "Легкая атлетика");
        Gymnast g2 = new Gymnast("Петров", 24, "Таджикистан", 160, 60, "Тяжелая атлетика");
        Gymnast g3 = new Gymnast("Климова", 21, "Укарина", 165, 56, "Фигурное катание");

        Footballer f1 = new Footballer("Ливандовский", 28, "Англия", "нападающий", "Манчестер");
        Footballer f2 = new Footballer("Баранов", 24, "Казахстан", "полузащитник", "Кайрат");
        Footballer f3 = new Footballer("Аршавин", 32, "Россия", "нападающий", "Манчестер");

        Swimmer s1 = new Swimmer("Баландин", 26, "Казахстан", "Брас", 1.04);
        Swimmer s2 = new Swimmer("Семенов", 23, "Латвия", "Брас", 1.12);
        Swimmer s3 = new Swimmer("Фелс", 27, "USA", "Троль", 0.54);

        Sportsman list[] = {g1, g2, g3, f1, f2, f3, s1, s2, s3};

        OlympicGames olympic = new OlympicGames();
        olympic.sportsmansList = list;

        for (int i = 0; i < olympic.sportsmansList.length; i++)
            olympic.sportsmansList[i].play();
    }
}