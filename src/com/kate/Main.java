package com.kate;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //create 2d array and fill by random numbers
        int[][] array2d = new int[5][9];
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = (int) (Math.random() * 100);
            }
        }

        findCornerElements(array2d); // TASK 1
//        showElementsRowColumn(array2d); // TASK 2
//        findMaxSumRow(array2d); // TASK 3
//        fillRandomAndSum(); // TASK4
//        fillRandNumTo10(); // TASK5

    }


    /**
     * TASK 1
     * Display the element in the upper right corner
     * and the element in the lower left corner of the array.
     *
     * @param array2d 2d random array
     */

    private static void findCornerElements(int[][] array2d) {


        for (int i = 0; i < array2d.length; i++, System.out.println()) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(" " + array2d[i][j] + " ");
            }
        }

        for (int i = 0; i < 1; i++) {
            System.out.print("\nUpper right corner " + array2d[i][array2d[i].length - 1] + "\n");
            System.out.print("Lower left corner " + array2d[array2d.length - 1][i] + "\n");
        }
    }

    /**
     * TASK 2
     * Display all elements of the 5th row and the 2nd column of the array.
     *
     * @param array2d 2d random array
     */


    private static void showElementsRowColumn(int[][] array2d) {

        for (int i = 0; i < array2d.length; i++, System.out.println()) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(" " + array2d[i][j] + " ");
            }
        }

        System.out.println("\nAll elements of the 5th row\n");

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
     * Display the row with maximum sum of elements.
     *
     * @param array2d 2d random array
     */

    private static void findMaxSumRow(int[][] array2d) {

        for (int i = 0; i < array2d.length; i++, System.out.println()) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(" " + array2d[i][j] + " ");
            }
        }

        System.out.println(" ");

        int sum;
        int temp = 0;
        for (int i = 0; i < array2d.length; i++) {
            sum = 0;
            for (int j = 0; j < array2d[i].length; j++) {
                sum = sum + array2d[i][j];
            }
            System.out.println("Sum of " + (i + 1) + " row: " + sum);

            if (sum > temp) {
                temp = sum;
            }
        }

        System.out.println("\nSum of the maximum row " + temp);
    }

    /**
     * TASK 4
     * Fill array with random numbers and display it.
     * Find sum elements of the matrix.
     */

    private static void fillRandomAndSum() {

        int[][] arrayRandom = new int[8][6];
        for (int i = 0; i < arrayRandom.length; i++) {
            for (int j = 0; j < arrayRandom[i].length; j++) {
                arrayRandom[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < arrayRandom.length; i++, System.out.println()) {
            for (int j = 0; j < arrayRandom[i].length; j++) {
                System.out.print(" " + arrayRandom[i][j] + " ");
            }
        }

        int sum = 0;
        for (int i = 0; i < arrayRandom.length; i++) {
            for (int j = 0; j < arrayRandom[i].length; j++) {
                sum = sum + arrayRandom[i][j];
            }
        }

        System.out.println("\nSum of the matrix elements " + sum);
    }

    /**
     * TASK 5
     * Fill array random unique elements
     */

    private static void fillRandNumTo10() {

        int row = 4;
        int col = 7;

        int[][] aRandTo10 = new int[row][col];
        int[] copyArray = new int[row * col];
        int[] newArray = new int[copyArray.length];

        // fill 1d array

        for (int i = 0; i < copyArray.length; i++) {
            int rand = (int) (Math.random() * 10);
            copyArray[i] = rand;
        }

        //remove repeat elements
        //find 2 repeat elements and copy to new array

        for (int i = 1; i < copyArray.length; i++) {

            if (copyArray[i] == 0) {
                copyArray[i] = 1;
            }
            if (copyArray[i] == copyArray[i - 1]) {
                newArray[i] = copyArray[i];
            }
        }

        //merge arrays, remove zeros

        for (int i = 0; i < copyArray.length; i++) {
            copyArray[i] = copyArray[i] - newArray[i];

        }

        //if 3 repeat elements

        for (int i = 1; i < copyArray.length; i++) {

            if (copyArray[i] == copyArray[i - 1]) {
                copyArray[i - 1] = copyArray[i] + 2;
            }
        }

        // add 1d array to 2d array

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                aRandTo10[j][i] = copyArray[i + col * j];
            }
        }

        for (int i = 0; i < aRandTo10.length; i++, System.out.println()) {
            for (int j = 0; j < aRandTo10[i].length; j++) {
                System.out.print(" " + aRandTo10[i][j] + " ");
            }
        }
    }
}













