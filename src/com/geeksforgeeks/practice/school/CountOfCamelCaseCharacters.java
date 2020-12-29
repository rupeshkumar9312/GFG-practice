package com.geeksforgeeks.practice.school;

import java.util.Scanner;

public class CountOfCamelCaseCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = (Integer.parseInt(scanner.nextLine()));
        for (int i = 0; i < t; i++) {
            String str = scanner.nextLine();
            int count = countUpperCase(str);
            System.out.println(count);
        }
    }

    public static int countUpperCase(String str) {
        int count = 0;
        for (char ch :
                str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }
        return count;
    }
}
