package lv.rcs.prebootcamp.lesson14;

public class Game {

    public static void main(String[] args) {
        Player john = new Player("John", new Weapon("Axe", 10));
        Player jane = new Player("Jane", new Weapon("Sword", 3));

        battle(john, jane);

        determineWinner(john, jane);
    }

    static void battle(Player player1, Player player2) {
        int i = 0;
        for (; i < 200; i++) {
            player1.attack(player2);
            player2.attack(player1);
        }
    }

    static void determineWinner(Player player1, Player player2) {
        int health1 = player1.getHealth();
        int health2 = player2.getHealth();

        int diff = health1 - health2;
        Player winner, looser;
        if (health1 > health2) {
            winner = player1;
            looser = player2;
        } else if (health2 > health1) {
            winner = player2;
            looser = player1;
        } else {
            System.out.println("Battle was a draw!");
            return;
        }
        System.out.println(winner.getName() + " won " + looser.getName() + " by " + Math.abs(diff)
                + " points.");
    }
}
