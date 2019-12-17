package lv.rcs.lesson11;

public class Task12 {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 5};
        int number = 5;

        System.out.println(search(numbers, number));

        int number2 = 2;
        int result = search(numbers, number2);
        System.out.println(result);

        int number3 = 10;
        int result2 = search(numbers, number3);
        System.out.println(result2);

//        if (numbers[0] == number) {
//            System.out.println("ir vienāds!");
//        } else {
//            System.out.println("nav vienāds");
//        }
    }

    static int search(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                return i;
            }
        }

//        if (numbers[0] == number) {
//            return 0;
//        } else if (numbers[1] == number) {
//            return 1;
//        } else if (numbers[2] == number) {
//            return 2;
//        }
        return -1;
    }
}
