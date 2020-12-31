package com.kate;

public class Main {

    public static void main(String[] args) {


        //create 2d array and fill by random numbers
        int[][] array2d = new int[5][9];
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = (int) (Math.random() * 100);
            }

        }

//        findCornerElements(array2d); // TASK 1
//        showElementsLineColumn(array2d); // TASK 2
        findMaxSumLine(array2d); // TASK 3
    }

    /**
     * TASK 1
     * Display the element in the upper right corner
     * and the element in the lower left corner of the array.
     * @param array2d 2d random array
     */

    private static void findCornerElements(int[][] array2d) {


        for (int i = 0; i < array2d.length; i++, System.out.println()) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(" " + array2d[i][j] + " ");

            }

        }

        for (int i = 0; i < 1; i++) {
            System.out.print(array2d[i][array2d[i].length - 1] + "\n");
            System.out.print(array2d[array2d.length - 1][i] + "\n");
        }


    }

    /**
     * TASK 2
     * Display all elements of the 5th line and the 2nd column of the array.
     * @param array2d 2d random array
     */


    private static void showElementsLineColumn(int[][] array2d) {

        for (int i = 0; i < array2d.length; i++, System.out.println()) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(" " + array2d[i][j] + " ");

            }

        }

        System.out.println("\nAll elements of the 5th line\n");

        for (int i = 4; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {

                System.out.print(" " + array2d[i][j] + " ");
            }
        }

        System.out.println("\n\nAll elements of the 2nd column\n");

        for (int i = 0; i < array2d.length; i++) {

            System.out.print(" " + array2d[i][1] + " ");
        }


    }

    /**
     * TASK 3
     * Display the line with maximum sum of elements.
     * @param array2d 2d random array
     */

    private static void findMaxSumLine(int[][] array2d) {
    }


}

