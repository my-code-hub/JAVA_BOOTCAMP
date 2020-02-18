package lv.rcs.prebootcamp.lesson4;

public class LoopExamples {

    public static void main(String...args) {
//        int i = 0;
//        while (i > -1) {
//            i++;
//            if (i == 10) {
//                // pārtrauc iterāciju, aiziet atkal uz cikla sākumu
//                continue;
//            }
//            if (i == 100) {
//                System.out.print(i);
//               // System.out.println("lets leave the loop!");
//                break;
//            } else {
//                System.out.print(i + ", ");
//            }
//        }
       // System.out.println("program end");

        //do while example
        int iterators = 2;
        do {
            System.out.println("iterators: " + iterators);
            iterators--;
        } while (iterators > 3);

        System.out.println("------------------");

        //while exapmle
        int iterators2 = 2;
        while (iterators2 > 3) {
            System.out.println("iterators2: " + iterators2);
            iterators2--;
        }
    }

}
