package com.harshitJaiswal.Assignment4;

import java.util.Scanner;

public class ManmohanLovesPattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int lines = n;

        int nst = 1;
//        If row number is n (>1), total character is n. First and last character is n-1 and rest are 0.

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < nst; j++) {
                if (i == 0) {
                    System.out.print(i+1);
                } else {
                    if (j == 0 || j == nst - 1) {
                        System.out.print(i);
                    } else {
                        System.out.print(0);
                    }
                }
            }
            System.out.println();

            nst += 1;
        }
    }
}
