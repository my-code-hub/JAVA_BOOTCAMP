package lv.rcs.finalpractice.hangman;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class GameMain {

    public static void main(String[] args) throws FileNotFoundException {
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your name: ");
        String name = sc.nextLine();
        Player player = new Player(name);
        int state = 0;
        while (state == 0) {
            System.out.println("Please choose one of options \n" +
                    "Easy game\n" +
                    "Medium game \n" +
                    "Hard game\n" +
                    "Game info \n" +
                    "Exit\n");
            input = sc.nextLine().toLowerCase();
            switch (input) {
                case "easy game":
                case "medium game":
                case "hard game":
                    Game g = new Game(player);
                    g.play(input);
                    if (!g.isContinuePlaying()) {
                        state = 1;
                    }
                    break;
                case "game info":
                    player.printStatistics();
                    break;
                case "exit":
                    state = 1;
                    break;
                default:
                    System.out.println("Command doesn't exist! ");
            }
        }
    }
}