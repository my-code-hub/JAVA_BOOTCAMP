package lv.rcs.prebootcamp.lesson14;

class Player {

    private String name;
    private int health;
    private Weapon weapon;

    Player(String name, Weapon weapon) {
        this.name = name;
        this.health = 1000;
        this.weapon = weapon;
    }

    String getName() {
        return name;
    }

    int getHealth() {
        return health;
    }

    void attack(Player victim) {
        if (!isAlive()) {
            System.out.println(name + " is unable to attack, because he is dead.");
            return;
        }
        System.out.println(name + " is attacking " + victim.getName() + " with " + weapon.getName());
        victim.subtractHealth(weapon.getPower());
    }

    private void subtractHealth(int points) {
        if (!isAlive()) {
            return;
        }
        health -= points;
        if (health < 0) {
            health = 0;
            System.out.println(name + " just lost all his last points and died!");
        } else {
            System.out.println(name + " lost " + points + " points and now has " + health + " left.");
        }
    }

    private boolean isAlive() {
        return health > 0;
    }
}
