package lv.rcs.bootcamp.interfaces.example;

public class AnimalsMain {

    public static void main(String[] args) {
        Animal animal = new Dog();
        Animal animal2 = new Cat();

        doStuff(animal);
        doStuff(animal2);
    }

    static void doStuff(Animal animal) {
        animal.makeNoise();
        if (animal instanceof Dog) {
            System.out.println("this is dog!");
        } else if (animal instanceof Cat) {
            System.out.println("this is a cat!");
        }
    }
}
