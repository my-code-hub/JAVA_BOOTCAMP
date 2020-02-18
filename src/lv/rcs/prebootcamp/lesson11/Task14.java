package lv.rcs.prebootcamp.lesson11;

public class Task14 {

    //14. Implement a method "calculateAverage" which has one parameter (array of whole numbers) calculates
    //    and returns the average of all number in array. Write an example program which uses this
    //    method and prints out the result.
    //    Example of method usage:
    //        int [] numbers = {1, 2, 3};
    //        int result = calculateAverage(numbers);
    //        System.out.println(result); //prints out 2
    //    hint: To calculate the average value of all the numbers in array you will need to sum all
    //          numbers in array and divide it by the length of array.
    public static void main(String[] args) {
        int [] numbers = {10, 2, 3};

        int result = calculateAverage(numbers);
        System.out.println("result 1 " + result);

        int [] numbers2 = {3, 4, 2};
        System.out.println("result 2 " + calculateAverage(numbers2));

        //izvadīt masīvu variants 1:
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);

        //1) uzrakstam ciklu, kas izvada visus skaitļus šajā masīva
        //izvadīt masīva vērtības variants 2:


        //3) izdalīt šo skaitļu summu ar masīva izmēru (numbers.length)
        //4) izvadīt rezultātu lietotājam
    }

    static int calculateAverage(int[] numbers) {
        int summa = 0;
        for (int i = 0; i < numbers.length; i++) {
            summa = summa + numbers[i];
//            System.out.println("numbers[i]: " + numbers[i]);
//            System.out.println("summa: " + summa);
        }
        //2) sasummēt visus skaitļus šajā masīvā
        int result = summa / numbers.length;
        return result;
    }
}
