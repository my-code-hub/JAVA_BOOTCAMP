package lv.rcs.lesson19;

public class MultiDimensionalArrays {

    public static void main(String[] args) {
        //create empty array of size 5
        int[] array1 = new int[5];
        //changing value to second element in array
        array1[1] = 10;
        //outputting second element value
        System.out.println("array1[1] is " + array1[1]);
        //outputting all values
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        //output new line
        System.out.println();


        //creating two dimensional array
        int[][] array2 = new int[3][3];
        //changing value
        array2[1][1] = 10;
        //accessing / outputting value
        System.out.println("array2[1][1] is " + array2[1][1]);
        System.out.println("-----------------------");

        //i is row number
        for (int i = 0; i < array2.length; i++) {
            //j is column number
            for (int j = 0; j < array2[i].length; j++) {
                System.out.println("array2[" + i + "][" + j + "] is " + array2[i][j]);
            }
        }


    }
}
