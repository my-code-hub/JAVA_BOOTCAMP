package lv.rcs.prebootcamp.lesson8;

public class Task9 {

    //    9. Implement a method "findHighest" which accepts array of whole numbers as argument returns
//    the highest value number in array. Write a program which demonstrates the usage of this method.
    public static void main(String[] args) {
        int[] randomNumbers = {5, 12, 8, 92, 10, 1};
        int result = findHighest(randomNumbers);
        System.out.println("highest number is: " + result);
    }

    static int findHighest(int[] numbers) {
        // loop trough array
        // declare variable int max;
        int maxValue = 0;
        for (int i = 0; i < numbers.length; i++) {
            int currentValue = numbers[i];
            if (maxValue < currentValue) {
                maxValue = currentValue;
            }
        }
        return maxValue;
    }
}
