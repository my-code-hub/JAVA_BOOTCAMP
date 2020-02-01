package lv.rcs.finalpractice.bullandcows;

class Rules {

    private Base example = new Base();
    private String[] guesses = {"5832", "4761", "1467", "1647", "1947"};

    Rules() {
    }

    boolean start() {
        System.out.println("\n\t Welcome to ");
        System.out.println("\t\t\t***** BULLS AND COWS ***** ");
        System.out.println();
        System.out.println("\tAre you ready to play the game? \t play\n" +
                "\tOr do you want to read the rules? \t rules");
        return true;
    }

    void giveExample() {
        example.initializeBoard();
        System.out.println("Example:\n" +
                "\t The secret code is 1947.");
        for (int i = 0; i < guesses.length; i++) {
            String number = "1947";
            example.countBullsAndCows(number, guesses[i]);
            example.addGuess(guesses[i]);
        }
        example.printBoard();
        System.out.println("Your goal is to guess the code in the fewest number\n" +
                "of turns.");
    }

    void tellRules() {
        System.out.println("\nRules: \n" +
                "Your task is to guess the secret code!\n" +
                "The code consists of ordered sequence of four num-\n" +
                "bers from 1 to 9 (without repetition).\n" +
                "The computer will tell you how close you are to the\n" +
                "correct answer by giving:\n" +
                "\t * the number of bulls - correct digits in the \n" +
                "\t   right position;\n" +
                "\t * the number of cows - correct digits in the \n" +
                "\t   wrong position;\n");
        giveExample();
        System.out.println("\nYou can choose between 3 levels:\n" +
                            "                * easy - 10 guesses;\n" +
                            "                * medium - 7 guesses;\n" +
                            "                * hard - 5 guesses.");
        System.out.println("\nYou can write command: \n" +
                "            * home   - to return to the beginning;\n" +
                "            * play   - to start a new game;\n" +
                "            * level  - to change the level;\n" +
                "            * rules  - to read the rules;\n" +
                "            * back   - to return to already started\n" +
                "                       game (works only from rules);\n" +
                "            * exit   - to exit the game.");
    }
}
