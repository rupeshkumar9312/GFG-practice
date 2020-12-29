package com.geeksforgeeks.practice.school;

/*
* Given a string S as input. Delete the characters at odd indices of the string.

Input: First line of input contains a single integer T which denotes the number of test cases. Each line of test case follows new string S.

Output: Corresponding to each test case, print the required string.

Constraints:

1<=T<=100
1<= length(S) <=1000


Example:

Input:
2
Geeks
GeeksforGeeks

Output:
Ges
GesoGes
*/

import java.util.Scanner;

import static java.lang.System.*;

public class JavaDeleteAlternateCharacters {

    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        int t = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < t; i++) {
            String str = scan.nextLine();
            String output = deleteAlternateCharacter(str);
            out.println(output);
        }
    }

    static String deleteAlternateCharacter(String sourceStr) {
        StringBuilder finalStr = new StringBuilder();
        for (int i = 0; i < sourceStr.length(); i = i + 2) {
            finalStr.append(sourceStr.charAt(i));
        }
        return finalStr.toString();
    }

}
