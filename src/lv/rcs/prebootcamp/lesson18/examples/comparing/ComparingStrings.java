package lv.rcs.prebootcamp.lesson18.examples.comparing;

public class ComparingStrings {

    public static void main(String[] args) {
        String name1 = "janis";
        String name2 = "janis";

        if (name1 == name2) {
            System.out.println(name1 + " and " + name2 + " are equal!");
        } else {
            System.out.println(name1 + " and " + name2 + " are NOT equal!");
        }

        String name3 = new String("janis");
        if (name1 == name3) {
            System.out.println(name1 + " and " + name3 + " are equal!");
        } else {
            System.out.println(name1 + " and " + name3 + " are NOT equal!");
        }

        if (name1.equals(name3)) {
            System.out.println(name1 + " and " + name3 + " are equal!");
        } else {
            System.out.println(name1 + " and " + name3 + " are NOT equal!");
        }

    }
}
