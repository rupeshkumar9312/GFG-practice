package com.geeksforgeeks.practice.school;

import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.*;

public class PatternOfStrings {

    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        int t = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < t; i++) {
            String str = scan.nextLine();
            out.println(str);
            printPattern(str);
        }
    }

    static void printPattern(String str) {
        String temp = str;
        for (int i = 0; i < str.length(); i++) {
            StringBuilder pattern = new StringBuilder();
            for (int j = 0; j < temp.length() - 1; j++) {
                pattern.append(temp.charAt(j));
            }
            out.println(pattern);
            temp = pattern.toString();
        }
    }
}
