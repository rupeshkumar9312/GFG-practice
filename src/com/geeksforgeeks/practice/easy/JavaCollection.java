package com.geeksforgeeks.practice.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaCollection {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < t; i++) {
            Map<String, Integer> hm = new HashMap<>();
            int n = scan.nextInt();
            for (int j = 0; j < n; j++) {
                String key = scan.next();
                int val = Integer.parseInt(scan.next());
                hm.put(key, val);
            }
            String isExists = scan.nextLine();
            if (hm.containsKey(isExists)) {
                System.out.println(hm.get(isExists));
            } else {
                System.out.println("-1");
            }
        }
    }

}
