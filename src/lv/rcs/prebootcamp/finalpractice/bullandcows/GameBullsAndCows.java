package lv.rcs.prebootcamp.finalpractice.bullandcows;

class GameBullsAndCows extends Base {
    private Rules rules = new Rules();
    private boolean exit;
    private boolean start;
    private boolean again;
    private boolean back;
    private String input;

    GameBullsAndCows() {
        playFinal();
    }

    void playFinal() {
        start = rules.start();
        do {
            //showNumber();
            System.out.print("\t");
            input = keyboard.nextLine().trim().toLowerCase();
            System.out.println();

            if ("level".equals(input) || start && "play".equals(input)) {
                start = again = back = false;
                exit = chooseLevel(input);
                seeBoard();
            } else if ("play".equals(input)) {
                again = back = false;
                initializeBoard();
                seeBoard();
            } else if ("rules".equals(input)) {
                back = true;
                rules.tellRules();
            }  else if ("back".equals(input) && !start && !again && back) {
                back = false;
                seeBoard();
            } else if ("home".equals(input)) {
                start = rules.start();
            } else if ("exit".equals(input)) {
                exit = true;
            } else if (!again && !start && !back && isInputValid(input)) {
                playGame(input);
            }  else {
                System.out.println("\t  Invalid input! Try something different!\n");
                if (!again && !start && !back) {
                    seeBoard();
                }
            }

            if (!again && (correctGuess() || finish())) {
                again = true;
                System.out.println("\nDo you want to play another round? \t play / exit");
            }

        } while (!exit);
        System.out.println("\t\t\t\t   Have fun!");
        System.out.println("\t\t\t Hope to see you soon!");
    }
}
