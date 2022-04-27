package Lesson_Pr_2_7;

public class Club {
    private String name;
    private String country;
    private int ratingPoints;
    private Player[] players;

    public Club(){

    }

    public Club (String name, String country, int ratingPoints, Player[] players){
        this.name = name;
        this.country = country;
        this.ratingPoints = ratingPoints;
        this.players = players;
    }

    public void printClubData(){
        System.out.println("------------------");
        System.out.println("Name:" + name);
        System.out.println("Country: " + country);
        System.out.println("RatingPoints: " + ratingPoints);
        for (int i=0; i<players.length; i++)
            System.out.println(players[i].toString());
    }
}