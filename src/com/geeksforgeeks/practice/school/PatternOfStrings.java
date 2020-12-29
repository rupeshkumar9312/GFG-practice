package com.geeksforgeeks.practice.school;

import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.*;

/*
*Given a string of length N, print the pattern of strings with first line with the given length of string and keep printing in new line the strings in decreasing order of length till you print the single first character of the given string.

Input: First line of the input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consist of only one line which contains a string of length N.

Output: Corresponding to each test case, pattern is printed in a new line.

Constraints:
1 <=T<= 30
N = 5

Example:
Input:
2
Geeks
th%ik

Output:
Geeks
Geek
Gee
Ge
G
th%ik
th%i
th%
th
t
*  */

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
