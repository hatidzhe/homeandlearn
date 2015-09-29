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

    public static void main(String[] args) {
        func1();
        func2();
        func3();
    }
}
