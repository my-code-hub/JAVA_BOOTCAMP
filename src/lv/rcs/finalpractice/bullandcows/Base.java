package lv.rcs.finalpractice.bullandcows;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Base {
    Scanner keyboard = new Scanner(System.in);
    private ArrayList<Integer> array = new ArrayList<Integer>();
    private int maxGuesses;
    private String[][] board;
    private String number;
    private String guess;
    private int round;

    Base() {
        maxGuesses = 7;
        board = new String[maxGuesses][6];
        makeNumberList();
        initializeBoard();
    }

    void showNumber() {
        System.out.println(number);
    } // delete when everything is completed

    void makeNumberList() {
        for (int i = 1; i <= 9; i++) {
            array.add(i);
        }
    }

    void generateNumber() {
        Collections.shuffle(array);
        StringBuilder num = new StringBuilder();
        number = "";
        for (int i = 0; i < 4; i++) {
            num.append(array.get(i));
        }
        number = num.toString();
    }

    void initializeBoard() {
        generateNumber();
        round = 0;
        for (int i = 0; i < board.length; i++) {
            //Arrays.fill(board[i], " ");
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = " ";
            }
        }
    }

    void countBullsAndCows(String number, String guess) {
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < 4; i++) {
            if (number.charAt(i) == guess.charAt(i)) {
                bulls++;
            }
        }
        board[round][4] = String.valueOf(bulls);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (number.charAt(i) == guess.charAt(j)) {
                    cows++;
                }
            }
        }
        cows -= bulls;
        board[round][5] = String.valueOf(cows);
    }

    void addGuess(String guess) {
        for (int i = 0, j = 0; i < guess.length(); i++, j++) {
            board[round][i] = String.valueOf(guess.charAt(j));
        }
        round++;
    }

    void printBoard() {
        //System.out.println();
        System.out.println("|           Your Guess          || Bulls | Cows  |");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (j == 0) {
                    System.out.print("|");
                }
                if (j == 3) {
                    System.out.print("   " + board[i][j] + "   ||");
                } else {
                    System.out.print("   " + board[i][j] + "   |");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    void useLastGuess() {
        if (maxGuesses - round == 1) {
            System.out.println("\t\t  You have only one guess left!");
        }
    }

    void playGame(String input) {
        guess = input;
        countBullsAndCows(number, guess);
        addGuess(guess);
        printBoard();
        useLastGuess();
        if (round != maxGuesses && !number.equals(guess)) {
            System.out.print("Your guess: \t ");
        }
    }

    boolean chooseLevel(String input) {
        boolean moveOn = true;
        do {
            System.out.println("\t  Choose the level: easy, medium or hard?");
            System.out.print("\t");
            input = keyboard.nextLine().trim().toLowerCase();
            System.out.println();
            switch (input) {
                case "easy":
                    maxGuesses = 10;
                    moveOn = true;
                    break;
                case "medium":
                    maxGuesses = 7;
                    moveOn = true;
                    break;
                case "hard":
                    maxGuesses = 5;
                    moveOn = true;
                    break;
                case "exit":
                    return true;
                default:
                    System.out.println("\t\t\t\t  Invalid input!\n");
                    moveOn = false;
            }
        } while (!moveOn);

        board = new String[maxGuesses][6];
        initializeBoard();
        return false;
    }

    boolean correctGuess() {
        if (number.equals(guess)) {
            System.out.println(" *** Congratulations! You guessed the number! ***");
            if (round == 1) {
                System.out.println("\t\t\t You are very lucky today!");
            }
            return true;
        }
        return false;
    }

    boolean finish() {
        if (round == maxGuesses) {
            System.out.println("\t\t\t   *** Game over! ***");
            System.out.println("\t\t\tThe combination was " + number + "!");
            return true;
        }
        return false;
    }

    boolean isNumber(String input) { // only numbers are allowed
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("\t\t\t\t Was it a number?");
            return false;
        }
    }

    boolean isLengthValid (String input) { // only four digit numbers are valid
        if (input.length() == 4) {
            return true;
        }
        System.out.println("\t  Your guess should be four digits long!");
        return false;
    }

    boolean isValidNumber(String input) {  // guesses with repeating numbers and containing 0 are not valid
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '0')  {
                System.out.println("  0 detected. Please choose numbers from 1 to 9.");
                return false;
            }
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    System.out.println("\t\tThere are duplicates in your guess.");
                    return false;
                }
            }
        }
        return true;
    }

    boolean isInputValid(String input) {
        return isNumber(input) & isLengthValid(input) && isValidNumber(input);
    }

    void seeBoard() {
        printBoard();
        System.out.print("Your guess: \t ");
    }
}
