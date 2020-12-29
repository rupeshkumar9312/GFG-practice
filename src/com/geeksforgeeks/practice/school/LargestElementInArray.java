package com.geeksforgeeks.practice.school;

import java.util.Scanner;

/*
* Given an array a[] of size N. The task is to find the largest element in it.

Input:
The first line of input contains an integer T, denoting the number of testcases. Then T test cases follow. Each test case contains an integer N , the number of elements in the array. Then next line contains N integers of the array separated by space.

Output:
Print the maximum element in the array.

Constraints:
1 <= T <= 100
1 <= N <= 100
1 <= a[i] <= 103

Example:
Input:
2
5
10 324 45 90 9808
7
1 2 0 3 2 4 5

Output:
9808
5

Explanation:
Testcase 1: The largest element of given array is: 9808.
* */

public class LargestElementInArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < t; i++) {
            int size = scan.nextInt();
            int[] arr = new int[size];
            readArray(scan, size, arr);
            System.out.println(findLargest(arr));
        }
    }

    public static int findLargest(int[] arr) {
        int largest = arr[0];
        for (int num :
                arr) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    public static void readArray(Scanner scan, int arrSize, int[] arr) {
        for (int j = 0; j < arrSize; j++) {
            arr[j] = scan.nextInt();
        }
    }

}
