package lv.rcs.prebootcamp.lesson5;

public class ArraysExample {

    public static void main(String[] args) {
        int x; //declaration
        x = 5; // initialization
        int y = 5; //declare and initialize

        int[] numbers = {8, 2, 5}; // declare and initialize
        // the same as:
        //int[] numbers = new int[]{8, 2, 5};
        // int[] numbers = {8, 2, 5};
        // or, if you declare and initialize later, you have to use new int[]
//         int [] numbers;
//         numbers = new int[] {8, 2, 5};

        System.out.println("numbers izmērs: " + numbers.length);
        System.out.println("numbers nultais elements: " + numbers[0]);
        numbers[0] = 77;
        System.out.println("numbers nultais elements (pamainita vertiba): " + numbers[0]);
        System.out.println("numbers pirmais elements: " + numbers[1]);
        System.out.println("numbers otrais elements: " + numbers[2]);
        //System.out.println("numbers trešais elements: " + numbers[3]);
        int lastElementIndex = numbers.length - 1;
        System.out.println("numbers pedejais elements: " + numbers[lastElementIndex]);
        System.out.println("numbers pedejais elements (variants): " + numbers[numbers.length - 1]);

        numbers[0] = 100;
        System.out.println("numbers nultais elements: " + numbers[0]);


        int[] numbers2 = new int[]{7, 9};
        System.out.println("numbers2 izmērs: " + numbers2.length);
        System.out.println("numbers2 pirmais elements: " + numbers2[1]);
        System.out.println("numbers2 nultais elements: " + numbers2[0]);
        //  System.out.println("numbers2 nultais elements: " + numbers2[2]);


        //tukšs masīvs ar izmēru 10 (for example, we could ask user to input)
        int[] numbers3 = new int[10];
        System.out.println("numbers3 izmērs: " + numbers3.length);
        System.out.println("numbers3 pirmais elements: " + numbers3[0]);

        numbers2 = numbers3;
        System.out.println("Jaunais numbers2 izmērs ir " + numbers2.length);

        // example where we multiply all elements
        int i = 0;
        int sum = 0;
        while (i < numbers2.length) {
//            sum = sum + numbers2[i++];
            sum += numbers2[i++]; // the same as sum = sum + numbers2[i++];
          //  System.out.println("elements: " + numbers2[i++]);
        }
        System.out.println("sum is: " + sum);


        // example


        //change reference example
        char[] arr1 = new char[5];
//        System.out.println(arr1[0]);

        //nomainīt vērtību


    }
}
