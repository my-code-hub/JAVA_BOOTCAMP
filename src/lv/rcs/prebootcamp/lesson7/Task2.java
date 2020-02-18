package lv.rcs.prebootcamp.lesson7;

public class Task2 {

    // 2.0 lets print out sum of all numbers
    // between 3 and 12 (use for loop)
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 3; i <= 12; i++) {
            //sum = sum + i;
            sum += i;
        }
        System.out.println(sum);
    }
}
