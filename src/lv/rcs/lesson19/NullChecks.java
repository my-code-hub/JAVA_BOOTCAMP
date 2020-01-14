package lv.rcs.lesson19;

public class NullChecks {

    public static void main(String[] args) {
        Person janis = new Person();
        System.out.println("janis.getName() - " + janis.getName());

        janis.setName("Janis");
        System.out.println("janis.getName() - " + janis.getName());

        janis.setName(null);
        System.out.println("janis.getName() - " + janis.getName());

        Person missingPerson = findPerson();
        if (missingPerson != null) {
            System.out.println("Found! - " + missingPerson.getName());
        } else {
            System.out.println("still missing");
        }

        Person john = null;
        john = new Person();
    }

    static Person findPerson() {
        return null;
    }
}
