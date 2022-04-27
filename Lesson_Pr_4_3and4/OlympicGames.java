package Lesson_Pr_4_3and4;

public class OlympicGames {
    String city;
    int year;
    Sportsman sportsmansList[];

    public OlympicGames() {

    }

    public OlympicGames(String city, int year, Sportsman sportsmansList[]) {
        this.city = city;
        this.year = year;
        this.sportsmansList = sportsmansList;
    }
}