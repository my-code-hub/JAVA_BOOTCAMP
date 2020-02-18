package lv.rcs.prebootcamp.lesson8;

public class MethodsArraysExamples {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 2, 5, 7};
        numbers = new int [] {10};
      //  int [] array = numbers;
        changeValue(numbers);
        changeValue2(numbers);
        printArray(numbers);

        int [] numbers2 = createNewArray();
        printArray(numbers2);
    }

    static void printArray(int[] array) {
        int limit = array.length;
        for (int i = 0; i < limit; i++) {
            System.out.println("element " + i + " is " + array[i]);
        }
    }

    static void changeValue(int[] array) {
        array[0] = 10;
    }

    static void changeValue2(int[] array) {
        int[] numbers2 = {4, 3, 2};
        printArray(array);
        printArray(numbers2);
        array = numbers2;
        printArray(array);
    }

    static int [] createNewArray() {
        return new int[] {1, 3, 5};
    }
}
