package lv.rcs.lesson17.examples.inheritance;

public class Sport {

    private String name;
    protected boolean isOlympic;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void description() {
        System.out.println("this sport is " + name + ". isOlympic: " + isOlympic);
    }
}
