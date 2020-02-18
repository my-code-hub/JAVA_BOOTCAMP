package lv.rcs.prebootcamp.lesson7;

public class Task4 {

//    4. declare and initialize array with four arbitrary whole numbers.
//    Print out all of the numbers from array.
    public static void main(String[] args) {

        int[] numbers = {8, 2, 5, 7}; // declare and initialize

        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println("i value is: " + i);
            System.out.println("numbers[" + i + "] is: " + numbers[i]);
        }

        // solution without loop
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);

    }
}
