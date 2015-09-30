package com.hatidzhe;

public class Main {

    public static void func1() {
        String changeCase = "text to change";
        System.out.println(changeCase);
        String result;
        result = changeCase.toUpperCase();

        System.out.println(result);
    }

    public static void func2() {
        String word1 = "Ape";
        String word2 = "App";
        int result;

        result = word1.compareTo(word2);

        if (result < 0) {
            System.out.println("word1 is less than word2");
        } else if (result > 0) {
            System.out.println("word1 is more than word2");
        } else if (result == 0) {
            System.out.println("the same word");
        }
    }

    public static void func3() {
        char ampersand = '@';
        String email_address = "you@me.com";

        int result;
        result = email_address.indexOf(ampersand);
        System.out.println(result);
    }

    public static void main(String[] args) {
        func1();
        func2();
        func3();
    }
}
