package lv.rcs.lesson18.exercises.comparing;

public class PersonMain {

    public static void main(String[] args) {
        Person janis = new Person("Janis", 20, "123");
        Person janis1 = new Person("Janis", 20, "123");

        if (janis.equals(janis1)) {
            System.out.println("THey are equal!");
        } else {
            System.out.println("not equal!");
        }

        Person juris = new Person("Juris", 20, "132");
        if (janis.equals(juris)) {
            System.out.println("THey are equal!");
        } else {
            System.out.println("not equal!");
        }
    }
}
