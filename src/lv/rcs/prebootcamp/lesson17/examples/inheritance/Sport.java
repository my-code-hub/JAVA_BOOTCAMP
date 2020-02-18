package lv.rcs.prebootcamp.lesson17.examples.inheritance;

public class Sport {

    private String name;
    protected boolean isOlympic;

    public Sport(String name) {



        System.out.println("Sport(String name)");
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void description() {
        System.out.println("this sport is " + name
                + ". isOlympic: " + isOlympic);
    }
}
