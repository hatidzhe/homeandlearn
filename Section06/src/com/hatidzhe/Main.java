package com.hatidzhe;

public class Main {

    int total(int aNumber) {
        int a_Value = aNumber + 10;
        return a_Value;
    }

    void print_text(String someText) {
        System.out.println("Some text here");
    }

    void print_text() {
        System.out.println("Some text here");
    }

    int total() {
        int a_Value = 10 + 10;
        return a_Value;

    }

    public static void main(String[] args) {

        MyMethods test1 = new MyMethods();
        int aVal = test1.total();
        System.out.println("The method's result is: " + aVal);
        test1.print_text();
        int aVal2 = test1.total(30);
        System.out.println("The second method's result is: " + aVal2);
        test1.print_text("The value was ", aVal2);

    }
}
