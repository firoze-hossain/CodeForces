package com.codeforces.bitPlusPlus;

import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        for (int i = 0; i < n; i++) {
            String st;
            st = sc.next();
            if (st.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }
        System.out.println(x);
    }
}
