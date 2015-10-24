package com.hatidzhe;

import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);

        String line1 = br.readLine();
        System.out.println(line1);
        String line2 = br.readLine();
        System.out.println(line2);
        String line3 = br.readLine();
        System.out.println(line3);
        br.close();
    }
}
