package lv.rcs.prebootcamp.lesson5;

public class Task3 {

    public static void main(String[] args) {
        //array declaration and initialization
        int[] numbers = {8, 2, 5};

        //print out array
        int i = 0;
        while(i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println("");
        //lets create a new array with the same size as numbers
        int[] numbersReverse = new int[numbers.length];

        int i2 = numbers.length - 1;
        int i3 = 0;
        while (i2 >= 0) {
//            System.out.println("i2 " + i2 + " - i3 " + i3);
            numbersReverse[i3] = numbers[i2];
            System.out.print(numbersReverse[i3] + " ");
            i2--;
            i3++;
        }

        // basically, the same as this code:
//        numbersReverse[2] = numbers[0];
//        numbersReverse[1] = numbers[1];
//        numbersReverse[0] = numbers[2];
    }
}
