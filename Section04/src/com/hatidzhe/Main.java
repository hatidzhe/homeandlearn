package com.hatidzhe;

import java.util.Arrays;

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

    public static void main(String[] args) {
        func1();
        func2();
        func3();
        func4();
        func5();
        func6(6);
        func7();
        func8();
    }
}
