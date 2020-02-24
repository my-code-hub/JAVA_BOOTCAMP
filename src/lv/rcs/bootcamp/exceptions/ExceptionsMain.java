package lv.rcs.bootcamp.exceptions;

public class ExceptionsMain {

    public static void main(String[] args) {
        example2();
        System.out.println("================");


     //   File file = new File("E://file.txt");
//        try {
//            FileReader fr = new FileReader(file);
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//        }


        Exception exception = new Exception("error");
        if (true) {
            System.out.println("hello!");
            try {
                throw new MyException2();
            } catch (MyException2 e) {
                System.out.println("catched MyException2! " + e.getMessage());
            } catch (MyException e) {
                System.out.println("catched MyException!");
            }

        }
        System.out.println("hello 2!");

        int [] numbers = new int[3];
       // numbers[5] = 5;
        System.out.println("...");

        System.out.println("Done!");

        Object object = null;


      //  object.toString();

//        try {
//            readFile(null);
//        } finally {
//            System.out.println("finally block!");
//        }
//        System.out.println("hello!");




    }

    static void example() {
        example();
    }

    static void readFile(String fileName) {
        if (fileName == null) {
            throw new RuntimeException("file name is null!");
        } else {
            //read and open file...
        }
    }


    static void example2() {
        try {
             int result = 5 / 0;
        } catch (ArithmeticException e) {
            throw new RuntimeException("dividing error", e);
        }
    }
}
