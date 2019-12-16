package lv.rcs.lesson8;

//11. Implement a method "calculateSum"
// which accepts one argument (array of whole numbers)
// and returns the sum of
// those numbers.
// hint: you will have to loop trough
// array and sum all of the elements in
// it and then return the result.
public class Task11 {

    public static void main(String[] args) {
        int [] array = {3, 2, 4};
        int result = calculateSum(array);
        System.out.println("rezultāts ir: " + result);
    }

    static int calculateSum(int[] numbers) {
        int summa = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("i: " + i);
            System.out.println("numbers[i]: " + numbers[i]);
            summa = summa + numbers[i];
            // summa += numbers[i];
            System.out.println("summa: " + summa);
        }
        System.out.println("atgriežam: " + summa);
        return summa;
    }
}
