package lv.rcs.lesson17.examples.inheritance;

public class Running extends Sport {

    private int distance;

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void description() {
        System.out.println("this sport is " + getName() + ". isOlympic: " + isOlympic +
                ", distance is " + distance);
    }
}
