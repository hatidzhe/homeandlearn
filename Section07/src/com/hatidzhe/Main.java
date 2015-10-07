package com.hatidzhe;

public class Main {

    public static void main(String[] args) {

        StudentResults aStudent = new StudentResults();

        String sName = aStudent.fullName("Bruce Lee");
        String exam = aStudent.examName("VB");
        String score = aStudent.examScore(30);
        String grade = aStudent.examGrade(30);
        System.out.println(sName);
        System.out.println(exam);
        System.out.println(score);
        System.out.println(grade);


    }
}
