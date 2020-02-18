package lv.rcs.prebootcamp.lesson11;

//13. Implement a method: (name it "toThePowerOf") which has two
// parameters (int base and int power) and returns the
//   result (base to power). Write a program which asks user to
//   input two whole numbers from and calls
//   the method with those numbers and then prints the result of the method.
//   For example: if user inputs 2 and 3, the result should be 8 (because 2^3=8).
//   You can't use Math.pow() method!
//
//   hint: to implement "To the power of" you can use loop and multiplication.
//         For example:
//          2 to the power 3 can be calculated as follows:
//          2 * 2 = 4; (first iteration)
//          4 * 2 = 8; (second iteration)
//         Basically, we will need a variable "sum" where we store the result and then keep multiplying
//         it with value power the same amount of times as the value of power.
public class Task13 {

    public static void main(String[] args) {
        int base = 2; //baaze
        int power = 3; //kaapinaataajs

        int result = toThePowerOf(base, power);
        System.out.println("result: " + result);
//        int result = 1;
//        for (int i = 0; i < power; i++) {
//            result = result * base;
//        }
//        System.out.println("result: " + result);
    }

    static int toThePowerOf(int base, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result = result * base;
        }
        return result;
    }
}
