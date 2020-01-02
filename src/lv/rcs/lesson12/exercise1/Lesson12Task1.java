package lv.rcs.lesson12.exercise1;

public class Lesson12Task1 {

    public static void main(String[] args) {
        Animal duke = new Animal("dog", "Duke", 4);
        duke.makeSound();
        Animal toms = new Animal("cat", "Tom", 7);
        toms.makeSound();
        Animal rat = new Animal("rat", "Jerry", 3);
        rat.makeSound();
    }
}
