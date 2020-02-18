package lv.rcs.prebootcamp.finalpractice.everythings_peachy;

import java.util.Random;
import java.util.Scanner;

public class Everythings_Peachy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] wordPool = {"apple", "orange", "pineapple", "apricot", "banana", "blueberry",
                "cherry", "watermelon", "lime", "grape", "lemon", "mandarin", "peach", "plum",
                "raspberry", "pomegranate", "strawberry"};
        boolean weArePlaying = true;

        while (weArePlaying) {
            System.out.println("Welcome to word guessing game 'Everything's peachy'!");
            char[] randomWordToGuess = wordPool[random.nextInt(wordPool.length)].toCharArray();
            int amountOfGuesses = randomWordToGuess.length;
            char[] playerGuess = new char[amountOfGuesses];
            char[] wrongLetters = new char[amountOfGuesses];
            for (int i = 0; i < playerGuess.length; i++) {
                playerGuess[i] = '_';
            }
            boolean wordIsGuessed = false;
            int wrongs = 0;
            //a new loop inside of the main while loop,in which the game actually takes place
            while (!wordIsGuessed && wrongs != amountOfGuesses) { // while the word is not guessed and the amount of wrongs is not exceeded, this code is executed.
                System.out.println("Current guesses: ");
                printArray(playerGuess); //a method to print out guesses
                int triesLeft = amountOfGuesses - wrongs;
                System.out.println("You have " + triesLeft + " tries left!");
                System.out.println();
                System.out.println("Enter a single letter:");
                char input = scanner.nextLine().toLowerCase().charAt(0);// .toLowerCase() sets user input to lower case if it's a capital letter + .charAt(0) takes only the first element in case the player inputs more than only one character
                if (!(input >= 65 && input <= 90) && !(input >= 97 && input <= 122)) { //to exclude symbols other than letters of alphabet
                    System.out.println("You have entered a wrong character. Please enter a letter!");
                    continue;
                }
                if (containsChar(input, playerGuess)) {
                    System.out.println("You have already used this letter! Try again!");
                    continue;
                }
                if (containsChar(input, wrongLetters)) {
                    System.out.println("You have already used this letter! Try again!");
                    continue;
                }
                boolean isMatch = false;
                for (int i = 0; i < randomWordToGuess.length; i++) {
                    if (randomWordToGuess[i] == input) {
                        playerGuess[i] = input;
                        isMatch = true;
                    }
                }
                if (isMatch == false) {
                    System.out.println("There is no such letter in this word!");
                    for (int i = 0; i < wrongLetters.length; i++) {
                        wrongLetters[i] = input;
                    }
                    wrongs++;
                    continue;
                }
                if (isTheWordGuessed(playerGuess)) {
                    wordIsGuessed = true;
                    System.out.println("Congratulations, you guessed the word!");
                    printArray(playerGuess);
                }
            }
            if (!wordIsGuessed) {
                System.out.println();
                System.out.println("You've ran out of guesses :("); //when ending the loop with no luck
            }
            System.out.println("Do you want to play another game? (yes/no)");
            String anotherGame = scanner.nextLine();
            System.out.println();
            if (anotherGame.equals("no"))
                weArePlaying = false;
        }
        System.out.println("Game over");
    }

    static boolean containsChar(char input, char[] word) {
        for (int i = 0; i < word.length; i++) {
            if (word[i] == input) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTheWordGuessed(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '_')
                return false;
        }
        return true;
    }

    public static void printArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}