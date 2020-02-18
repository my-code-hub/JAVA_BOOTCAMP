package lv.rcs.bootcamp.arrays;

public class ArrayExamples {

    public static void main(String[] args) {
        String[] array = {"42", "12", "85"};

        for (int i = 0; i < array.length; i++) {
            int param = Integer.parseInt(array[i]);
            //
        }

        //Converting String to integer
        String text = "12";
        int number = Integer.parseInt(text);
        System.out.println(number);

        //creating new array
        int[] numbers = new int[5];

        //assign value to second element in array
        numbers[1] = 100;

        //output second element in array
        System.out.println(numbers[1]);



    }
}
