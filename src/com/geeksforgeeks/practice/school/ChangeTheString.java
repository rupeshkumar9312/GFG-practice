package com.geeksforgeeks.practice.school;

import java.util.Scanner;

public class ChangeTheString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < t; i++) {
            String input = scanner.nextLine();
            String sanitizedString = sanitize(input);
            System.out.println(sanitizedString);
        }
    }

    private static String sanitize(String input) {
        String str = input.substring(1);
        if (input.charAt(0) >= 'A' && input.charAt(0) <= 'Z') {
            str = str.toUpperCase();
            return input.charAt(0) + str;
        }
        str = str.toLowerCase();
        return input.charAt(0) + str;
    }
}
