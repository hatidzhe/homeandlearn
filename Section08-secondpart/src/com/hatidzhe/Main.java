package com.hatidzhe;

public class Main {

    public static void main(String[] args) {

        int LetterCount = 0;
        String check_word = "Debugging";
        String single_letter = " ";
        int i;

        for (i = 0; i < check_word.length(); i++) {
            single_letter = check_word.substring(i, i+1);

            if (single_letter.equals("g")) {
                LetterCount++;
            }
        }

        System.out.println("G was found " + LetterCount + " times. ");
    }
}
