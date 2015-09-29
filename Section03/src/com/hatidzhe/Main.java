package com.hatidzhe;

import java.util.Scanner;

public class Main {

    public static void func1() {
        int user = 18;
        if (user <= 18) {
            System.out.println("User is less than 18");
        }
    }

    public static void func2() {
        int user = 18;
        switch (user) {
            case 18:
                System.out.println("You're 18");
                break;
            case 19:
                System.out.println("You're 19");
                break;
            case 20:
                System.out.println("You're 20");
                break;
            default:
                System.out.println("You're not 18, 19, 20");
        }
    }

    public static void func3() {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = user_input.nextInt();

        switch (age) {

            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:

                System.out.println(age + " is between 0 and 10");
                break;

            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:

                System.out.println(age + " is between 11 and 20");
                break;

            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:

                System.out.println(age + " is between 21 and 30");
                break;

            default:

                System.out.println("You are over 30");

        }
    }

    public static void func4() {

        Scanner user_input = new Scanner(System.in);
        System.out.println("Choose a colour: Black, White, Red, Blue ");
        String colour = user_input.next();

        if (colour.equals("Black")) {

            System.out.println("You must be a Goth!");

        } else if (colour.equals("White")) {

            System.out.println("You are a very pure person!");

        } else if (colour.equals("Red")) {

            System.out.println("You are fun and outgoing ");

        } else if (colour.equals("Blue")) {

            System.out.println("You’re not a Chelsea fan, are you?");

        } else {

            System.out.println("Sorry, didn't catch that!");

        }
    }

    public static int func5(int i, int end_value) {

        for (i = 0; i < end_value; i++) {

            System.out.println("Loop Value = " + i);
        }
        return i;
    }

    public static int func6(int i, int end_value) {
        int sum = 0;
        for (i = 0; i <= end_value; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of the numbers is " + sum);
        return sum;
    }

    public static int func7(int i, int end_value) {
        int times_table;
        int addition = 0;

        Scanner user_input = new Scanner(System.in);
        System.out.println("Which times table do you want?");
        times_table = user_input.nextInt();

        for (i = 1; i < end_value; i++) {
            addition = i * times_table;
            System.out.println(i + " times " + times_table + " = " + addition);
        }
        return addition;
    }

    public static int func8(int i, int end_value){
        int reminder;
        System.out.print("The odd numbers between " + i +" and " + end_value + " are:");
        for (i=1; i<end_value;i++){
            reminder = i % 2;
            if (reminder!=0){
                System.out.print(i+ " ");
            }
        }
        return i;
    }

    public static void main(String[] args) {
        func1();
        func2();
        func3();
        func4();
        func5(0, 11);
        func6(1, 100);
        func7(1, 11);
        func8(1,100);
    }
}
