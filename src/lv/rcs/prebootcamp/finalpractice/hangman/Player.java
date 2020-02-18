package lv.rcs.prebootcamp.finalpractice.hangman;

public class Player {

    private String name;
    private int gamesPlayed;
    private int gamesWon;

    public Player(String name) {
        this.name = name;
        this.gamesPlayed = 0;
        this.gamesWon = 0;
    }

    public void addGamesPlayed() {
        gamesPlayed++;
    }

    public void addGamesWon() {
        gamesWon++;
    }

    private double percentageOfWinning() {
        double percentage = ((double) gamesWon / (double) gamesPlayed) * 100;
        return percentage;
    }

    public void printStatistics() {
        System.out.println("Player " + name + "\nGames played: " + gamesPlayed + "\nGames won: " + gamesWon);
        System.out.println("Player has won " + (Math.round(percentageOfWinning() * 100.0) / 100.0) + "% of games!\n\n");
    }
}