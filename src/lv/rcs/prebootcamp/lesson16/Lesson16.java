package lv.rcs.prebootcamp.lesson16;

public class Lesson16 {

    public static void main(String[] args) {
        System.out.println("Hello!");

        Person person = new Person();

        //multiple ways of creating an array
        int [] array = new int[3];
        int [] array2 = {0, 0, 0};
        int [] array3 = new int[] {0, 0, 0};

        //test({0, 0, 0}); - won't work
        test(new int[] {0, 0, 0});
    }

    private static void test(int [] arr) {

    }
}
