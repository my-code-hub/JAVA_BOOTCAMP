package lv.rcs.prebootcamp.lesson5;

public class ExampleStrings2 {

    public static void main(String [] args) {
        String name = "Janis";
        String name2 = "Juris";
        String name3 = "janis";
        String name4 = "Janis";

        if (name.equals(name2)) {
            System.out.println("name.equals(name2) ir patiess");
        } else {
            System.out.println("name.equals(name2) nav patiess");
        }

        if (name.equals(name3)) {
            System.out.println("name.equals(name3) ir patiess");
        } else {
            System.out.println("name.equals(name3) nav patiess");
        }

        if (name.equals(name4)) {
            System.out.println("name.equals(name4) ir patiess");
        } else {
            System.out.println("name.equals(name4) nav patiess");
        }

        // using equals operator is bad
        if (name == name2) {
            System.out.println("they match!");
        } else {
            System.out.println("they don't match");
        }
    }
}
