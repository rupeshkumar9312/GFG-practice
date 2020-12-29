package com.geeksforgeeks.practice.school;

import java.util.Arrays;
import java.util.Scanner;

/*
* Given an integer array A of size N, find sum of elements in it.

Input:
First line contains an integer denoting the test cases 'T'. T testcases follow. Each testcase contains two lines of input. First line contains N the size of the array A. The second line contains the elements of the array.

Output:
For each testcase, print the sum of all elements of the array in separate line.

Constraints:
1 <= T <= 100
1 <= N <= 100
1 <= Ai <= 100

Example:
Input:
2
3
3 2 1
4
1 2 3 4
Output:
6
10
* */

public class SumOfArrayElements {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < t; i++) {
            int arrSize = (scan.nextInt());
            int[] arr = new int[arrSize];
            readArray(scan, arrSize, arr);
            int sum = sumOfArrayElements(arr);
            System.out.println(sum);
        }
    }

    public static void readArray(Scanner scan, int arrSize, int[] arr) {
        for (int j = 0; j < arrSize; j++) {
            arr[j] = scan.nextInt();
        }
    }

    static int sumOfArrayElements(int[] arr) {
        return Arrays.stream(arr).sum();
    }

}
