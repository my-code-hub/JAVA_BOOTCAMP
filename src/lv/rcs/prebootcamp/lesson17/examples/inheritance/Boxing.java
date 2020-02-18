package lv.rcs.prebootcamp.lesson17.examples.inheritance;

public class Boxing extends Sport {

    private int rounds;

    public Boxing(String name, int rounds) {
        super(name);
        this.rounds = rounds;
    }

    public int getRounds() {
        return rounds;
    }
}
