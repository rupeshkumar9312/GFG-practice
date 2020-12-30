package com.geeksforgeeks.practice.school;

import java.util.Scanner;

import static com.geeksforgeeks.practice.school.LargestElementInArray.readArray;

public class MaximumAndMinimumOfArrayElements {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < t; i++) {
            int size = scan.nextInt();
            int[] arr = readArray(scan, size);
            int[] minMax = findMinAndMax(arr);
            System.out.println(minMax[0] + " " + minMax[1]);
        }
    }

    public static int[] readArray(Scanner scan, int arrSize) {
        int[] arr = new int[arrSize];
        for (int j = 0; j < arrSize; j++) {
            arr[j] = scan.nextInt();
        }
        return arr;
    }

    private static int[] findMinAndMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int num :
                arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return new int[]{max, min};
    }
}
