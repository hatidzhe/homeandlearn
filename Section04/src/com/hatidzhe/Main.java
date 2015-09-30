package com.hatidzhe;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void func1() {
        int[] aryNums;
        aryNums = new int[6];
        aryNums[0] = 10;
        aryNums[1] = 14;
        aryNums[2] = 36;
        aryNums[3] = 27;
        aryNums[4] = 43;
        aryNums[5] = 18;
        System.out.println(aryNums[2]);
    }

    public static void func2() {
        int[] lottery_numbers = new int[49];
        int i;
        for (i = 0; i < lottery_numbers.length; i++) {
            lottery_numbers[i] = i + 1;
            System.out.println(lottery_numbers[i]);
        }
    }

    public static void func3() {
        int[] aryNums;
        aryNums = new int[6];
        aryNums[0] = 10;
        aryNums[1] = 14;
        aryNums[2] = 36;
        aryNums[3] = 27;
        aryNums[4] = 43;
        aryNums[5] = 18;

        Arrays.sort(aryNums);
        int i;
        for (i = 0; i < aryNums.length; i++) {
            System.out.println("num: " + aryNums[i]);
        }
    }

    public static void func4() {

        String[] aryString = new String[5];

        aryString[0] = "This";
        aryString[1] = "is";
        aryString[2] = "a";
        aryString[3] = "string";
        aryString[4] = "array";

        int i;
        for (i = 0; i < aryString.length; i++) {
            System.out.println(aryString[i]);
        }
    }

    public static void func5() {

        String[] aryString = new String[5];

        aryString[0] = "this";
        aryString[1] = "is";
        aryString[2] = "a";
        aryString[3] = "string";
        aryString[4] = "array";
        Arrays.sort(aryString);

        int i;
        for (i = 0; i < aryString.length; i++) {
            System.out.println(aryString[i]);
        }
    }

    public static double func6(int i) {
        int[] aryNums = {23, 6, 47, 35, 2, 14};
        int sum = 0;
        for (i = 0; i < aryNums.length; i++) {
            sum = sum + aryNums[i];

        }
        double avg = sum / aryNums.length;
        System.out.println("The average of the numbers in the array is " + avg);

        return avg;
    }

    public static void func7() {
        int[] aryNums = {23, 6, 47, 35, 2, 14};
        Arrays.sort(aryNums);
        int lastArrayNumber = aryNums.length - 1;
        System.out.println("The highest number in the sorted array is: " + aryNums[lastArrayNumber]);

    }

    public static void func8() {

        int[] aryNums = {23, 6, 47, 35, 2, 14};
        int i;
        int remainder = 0;
        for (i = 0; i < aryNums.length; i++) {

            remainder = aryNums[i] % 2;

            if (remainder == 1) {

                System.out.println("odd number in the array is: " + aryNums[i]);

            }
        }
    }

    public static void func9() {

        int[][] aryNumbers = new int[6][5];

        aryNumbers[0][0] = 10;
        aryNumbers[0][1] = 12;
        aryNumbers[0][2] = 43;
        aryNumbers[0][3] = 11;
        aryNumbers[0][4] = 22;

        aryNumbers[1][0] = 20;
        aryNumbers[1][1] = 45;
        aryNumbers[1][2] = 56;
        aryNumbers[1][3] = 1;
        aryNumbers[1][4] = 33;

        aryNumbers[2][0] = 30;
        aryNumbers[2][1] = 67;
        aryNumbers[2][2] = 32;
        aryNumbers[2][3] = 14;
        aryNumbers[2][4] = 44;

        aryNumbers[3][0] = 40;
        aryNumbers[3][1] = 12;
        aryNumbers[3][2] = 87;
        aryNumbers[3][3] = 14;
        aryNumbers[3][4] = 55;

        aryNumbers[4][0] = 50;
        aryNumbers[4][1] = 86;
        aryNumbers[4][2] = 66;
        aryNumbers[4][3] = 13;
        aryNumbers[4][4] = 66;

        aryNumbers[5][0] = 60;
        aryNumbers[5][1] = 53;
        aryNumbers[5][2] = 44;
        aryNumbers[5][3] = 12;
        aryNumbers[5][4] = 11;

        int rows = 6;
        int columns = 5;

        int i, j;

        for (i = 0; i < rows; i++) {

            for (j = 0; j < columns; j++) {

                System.out.print(aryNumbers[i][j] + " ");

            }

            System.out.println("");

        }
    }

    public static void func10() {
        ArrayList listTest = new ArrayList();
        listTest.add("first item");
        listTest.add("second item");
        listTest.add("third item");
        listTest.add(7);

        Iterator itr = listTest.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        listTest.remove("second item");
        System.out.println("Whole list= " + listTest);
        System.out.println("Position 1 = " + listTest.get(1));
    }

    public static void main(String[] args) {
        func1();
        func2();
        func3();
        func4();
        func5();
        func6(6);
        func7();
        func8();
        func9();
        func10();
    }
}
