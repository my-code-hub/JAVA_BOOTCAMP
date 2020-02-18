package lv.rcs.prebootcamp.lesson17.examples.interfaces;

public class Rectangle implements Shape {

    public int getArea() {
        return 50;
    }

    @Override
    public void printName() {
        System.out.println("rectangle!");
    }
}
