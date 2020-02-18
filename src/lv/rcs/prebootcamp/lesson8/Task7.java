package lv.rcs.prebootcamp.lesson8;

//7. Implement a method "isEven" which has one parameter (whole number) and returns true if the number is
//   even or false, if it is not. Write a program which uses this method and outputs the result to user.
//   ( hint: you can use % to check if number is event.
//     Example: https://www.programmingsimplified.com/java/source-code/java-program-odd-even)
public class Task7 {

    public static void main(String[] args) {
        boolean result1 = isEven(10);
        System.out.println("result1 is " + result1);

        boolean result2 = isEven(5);
        System.out.println("result2 is " + result2);
    }

    static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //the same thing, but just shorter
    static boolean isEvenVariants2(int number) {
        return number % 2 == 0;
    }
}
