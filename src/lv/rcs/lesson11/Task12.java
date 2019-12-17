package lv.rcs.lesson11;

public class Task12 {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 5};
        int number = 5;

        search(numbers, number);

        if (numbers[0] == number) {
            System.out.println("ir vienāds!");
        } else {
            System.out.println("nav vienāds");
        }
    }

    static int search(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("i: " + i);
            System.out.println("numbers[i]" + numbers[i]);
        }

        if (numbers[0] == number) {
            return 0;
        } else if (numbers[1] == number) {
            return 1;
        } else if (numbers[2] == number) {
            return 2;
        }
        return -1;
    }
}
