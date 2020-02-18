package lv.rcs.bootcamp.interfaces.example;

public class Cat implements Animal {
    @Override
    public void makeNoise() {
        System.out.println("meow!");
    }
}
