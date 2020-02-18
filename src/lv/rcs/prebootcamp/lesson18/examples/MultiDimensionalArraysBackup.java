package lv.rcs.prebootcamp.lesson18.examples;

public class MultiDimensionalArraysBackup {

    public static void main(String[] args) {
        int size = 5;

        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = (i + 1) * (j + 1);
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println();
        }

//        System.out.print("    ");
//        for (int i = 1; i <= size; i++) {
//            System.out.print(i + " | ");
//        }
//        System.out.println();
//        System.out.print("   ");
//        for (int i = 1; i <= size * 2; i++) {
//            System.out.print("- ");
//        }
//        System.out.println();

//        for (int i = 0; i < size; i++) {
////            System.out.print(i + 1 + " | ");
//            for (int j = 0; j < size; j++) {
//                System.out.print(arr[i][j] + " | ");
//            }
//            System.out.println();
//        }
    }
}
