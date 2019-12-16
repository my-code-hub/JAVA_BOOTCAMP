package lv.rcs.lesson8;

//10. Implement a method "findLowest" which accepts
//    array of whole numbers as argument returns the value of
//   lowest number in array. Write a program which
//   demonstrates the usage of this method.
public class Task10 {

    public static void main(String[] args) {
        int[] randomNumbers = {20, 10, 40, 50, 99};
        int result = findLowest(randomNumbers);
        System.out.println("lowest number is: " + result);
    }

    static int findLowest(int[] numbers) {
        //check if array is empty
        if (numbers.length == 0) {
            return Integer.MIN_VALUE;
        }
        //search for min value by checking each element in array
        // (comparing it with minValue and changing minValue
        // value to the new lowest number)
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            int currentValue = numbers[i];
            if (currentValue < minValue) {
                minValue = currentValue;
            }
        }
        return minValue;
    }
}
