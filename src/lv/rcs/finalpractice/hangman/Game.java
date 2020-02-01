package lv.rcs.finalpractice.hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private ArrayList<String> dictionary;
    private int lives;
    private String[] word;
    private ArrayList<char[]> wordMask;
    private int guessedLetters;
    private int letterCount;
    private Player player;
    private boolean continuePlaying;
    private ArrayList<String> hangman;
    private int startHangman;
    private int endHangman;
    private ArrayList<Character> letterList;

    public Game(Player player) {
        this.lives = 6;
        this.guessedLetters = 0;
        this.letterCount = 0;
        this.dictionary = new ArrayList<String>();
        this.wordMask = new ArrayList<char[]>();
        this.player = player;
        this.continuePlaying = false;
        this.hangman = new ArrayList<String>();
        this.startHangman = 0;
        this.endHangman = 7;
        letterList = new ArrayList<Character>();
    }

    private void readHangman() throws FileNotFoundException {
        Scanner input = new Scanner(new File("Hangman"));
        while (input.hasNext()) {
            hangman.add(input.nextLine());
        }
    }

    private void printHangman() {
        for (int i = startHangman; i < endHangman; i++) {
            System.out.println(hangman.get(i));
        }
        startHangman += 7;
        endHangman += 7;
    }

    private void setWord(String level) throws FileNotFoundException {
        Random r = new Random();
        int rand;
        Scanner input;
        if (level.equals("easy game")) {
            input = new Scanner(new File("Easy"));
        } else if (level.equals("medium game")) {
            input = new Scanner(new File("Medium"));
        } else {
            input = new Scanner(new File("Hard"));
        }
        while (input.hasNext()) {
            dictionary.add(input.nextLine().toLowerCase());
        }
        rand = r.nextInt(dictionary.size());
        word = dictionary.get(rand).split("\\s+");
        SetMask();
        readHangman();
    }

    private void SetMask() {
        for (int i = 0; i < word.length; i++) {
            char[] tempMask = new char[word[i].length()];
            letterCount += word[i].length();
            for (int j = 0; j < word[i].length(); j++) {
                tempMask[j] = '_';
            }
            wordMask.add(tempMask);
        }
    }

    private void printMask() {
        System.out.print("\n");
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < word[i].length(); j++) {
                System.out.print(wordMask.get(i)[j] + " ");
            }
            System.out.print("  ");
        }
        System.out.println();
    }

    private void decreaseLives() {
        lives--;
    }

    private void checkLetter(char letter) {
        boolean correctGuess = false;
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < word[i].length(); j++)
                if (word[i].charAt(j) == letter) {
                    wordMask.get(i)[j] = letter;
                    correctGuess = true;
                    if (!repeatedLetter(letter)) {
                        guessedLetters++;
                    }
                }
        }
        if (!correctGuess) {
            decreaseLives();
            System.out.println("Incorrect guess! You lost one life");
            printHangman();
        }
    }

    private boolean repeatedLetter(char letter) {
        for (int i = 0; i < letterList.size(); i++) {
            if (letter == letterList.get(i)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkWinner() {
        if (guessedLetters == letterCount && lives > 0) {
            return true;
        }
        return false;
    }

    public void play(String level) throws FileNotFoundException {
        setWord(level);
        player.addGamesPlayed();
        Scanner sc = new Scanner(System.in);
        while (lives > 0 && !checkWinner()) {
            printMask();
            System.out.println("Please input a letter: ");
            char letter = sc.next().charAt(0);
            checkLetter(letter);
            letterList.add(letter);
        }
        if (checkWinner()) {
            printMask();
            System.out.println("Congratulation! You won the game!\n\n");
            player.addGamesWon();
        } else {
            System.out.println("Sorry! You lost the game!");
            System.out.print("Correct word/ phrase was: ");
            for (int i = 0; i < word.length; i++) {
                System.out.print(word[i] + " ");
            }
            System.out.print("\n\n");
        }
        System.out.println("Return to Main Menu? (Y/N) ");
        char answer = sc.next().charAt(0);
        if (answer == 'Y' || answer == 'y') {
            continuePlaying = true;
        }
    }

    public boolean isContinuePlaying() {
        return continuePlaying;
    }
}