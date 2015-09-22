package com.hatidzhe;

import java.util.Scanner;

public class Main {


    public static void func1() {
        int first_number;
        System.out.println("My First Project");
    }

    public static void func2() {
        int first_number;
        first_number = 10;
        System.out.println("My First Project");
    }

    public static int func3(int first_number, int second_number) {
        int answer;
        answer = first_number + second_number;
        System.out.println("The sum of the integer variables is " + answer);
        return answer;
    }

    public static double func4(double first_n, double second_n) {

        double sum;
        sum = first_n + second_n;
        System.out.println("The sum of the double variables is " + sum);
        return sum;
    }

    public static float func5(float first_number, float second_number) {
        float answer;
        answer = first_number / second_number;
        System.out.println("The result of the division of the float variables is " + answer);
        return answer;
    }

    public static int func6(int a, int b, int c) {
        int answer;
        answer = (a - b) + c;
        System.out.println("The result of the func6 is " + answer);
        return answer;
    }

    public static int func7(int a, int b, int c) {
        int answer;
        answer = a - (b + c);
        System.out.println("The result of the func7 is " + answer);
        return answer;
    }

    public static void func8() {
        String first_name = "William";
        String family_name = "Shakespeare";
        System.out.println(first_name + " " + family_name);
    }

    public static void func9() {
        char first_name = 'W';
        char family_name = 'S';
        System.out.println(first_name + " " + family_name);
    }

    public static void func10() {
        Scanner user_input = new Scanner(System.in);

        String first_name;
        System.out.print("Enter your first name: ");
        first_name = user_input.next();

        String family_name;
        System.out.print("Enter your family name: ");
        family_name = user_input.next();

        String full_name;
        full_name = first_name + " " + family_name;

        System.out.println("You are: " + full_name);

    }


    public static void main(String[] args) {
        func1();
        func2();
        func3(3, 9);
        func4(10.5, 20.8);
        func5(10.5f, 20.8f);
        func6(100, 75, 25);
        func7(100, 75, 25);
        func8();
        func9();
        func10();
    }

}

