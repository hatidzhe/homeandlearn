package com.hatidzhe;

public class Main {

    public static void main(String[] args) {

        StudentResults aStudent = new StudentResults();

        String sName = aStudent.fullName("Bruce Lee");
        String exam = aStudent.examName("VB");
        String score = aStudent.examScore(30);
        String grade = aStudent.examGrade(30);
        String score2 = aStudent.examScore(60, " out of 100");
        System.out.println(sName);
        System.out.println(exam);
        System.out.println(score);
        System.out.println(score2);
        System.out.println(grade);

        StudentResults studentOne = new StudentResults();
        String student_name = studentOne.fullName();
        System.out.println(student_name);

        StudentResults studentTwo = new StudentResults("female");
        String student_name2 = studentTwo.fullName();
        System.out.println(student_name2);

        Certificates c1 = new Certificates();
        exam = c1.examName("VB");
        System.out.println(exam);

        String award = c1.certificateAwarded(50);
        System.out.println(exam + " " + award);


    }
}
