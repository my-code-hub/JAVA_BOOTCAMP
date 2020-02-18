package lv.rcs.prebootcamp.lesson4;

public class SwitchExample {

    public static void main(String... args) {
        char grade = 'E';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
            case 'B':
                System.out.println("case b");
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
    }
}
