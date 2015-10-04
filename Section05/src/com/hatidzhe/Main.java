package com.hatidzhe;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.Scanner;

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
        System.out.println("The searched character is in the position:" + result);
    }

    public static void func4() {

        char ampersand = '@';
        String email_address = "you@me.com";

        int result;
        result = email_address.indexOf(ampersand);

        if (result == -1) {
            System.out.println("Invalid Email Address");
        } else {
            System.out.println("The Email Address is correct");
        }
    }

    public static void func5() {
        String dotCom = ".com";
        String email_address = "you@me.com";

        int result;
        result = email_address.indexOf(dotCom);

        if (result == -1) {
            System.out.println("Invalid Email Address");
        } else {
            System.out.println("The Email Address is correct");
        }
    }

    public static void func6() {
        char ampersand = '@';
        String dotCom = ".com";
        String email_address = "you@me.com";

        int atPos = email_address.indexOf(ampersand);
        int result = email_address.indexOf(dotCom, atPos);

        if (result == -1) {
            System.out.println("Invalid Email Address");
        } else {
            System.out.println("The Email Address is correct " + result);

        }

    }

    public static void func7() {
        String FullName = "Bruce Lee";
        String FirstNameChars = "";

        FirstNameChars = FullName.substring(0, 2);
        System.out.println(FirstNameChars);
    }

    public static void func8() {
        String FullName = "Bruce Lee";
        String FirstNameChars = "";

        FirstNameChars = FullName.substring(0, 2);
        System.out.println(FirstNameChars);

        int spacePos = FullName.indexOf(" ");
        System.out.println("Space is at position " + spacePos);

    }

    public static void func13() {
        String email_address1 = "you@me.cob";
        String email_address2 = "you@me.com";
        boolean isMatch = false;

        isMatch = email_address1.equals(email_address2);

        if (isMatch == true) {
            System.out.println("Email Address Match");
        } else {
            System.out.println("Email addresses don't match.");
        }

    }

    public static void func14() {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Quit Y/N");
        String aString = user_input.next();
        char aChar = aString.charAt(0);
        if (aChar == 'Y') {
            System.out.println("OK, Bye bye");
        } else {
            System.out.println("Not Quitting");
        }
    }

    public static void func15() {
        String aString = "Where are you books?";
        String amend = aString.replace("you", "your");
        System.out.println(amend);
    }

    public static void main(String[] args) {
        func1();
        func2();
        func3();
        func4();
        func5();
        func6();
        func7();
        func8();
        func13();
        func14();
        func15();
    }
}
