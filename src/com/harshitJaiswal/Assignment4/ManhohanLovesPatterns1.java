package com.harshitJaiswal.Assignment4;

import java.util.Scanner;

public class ManhohanLovesPatterns1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int lines = n;
        int nst = 1;

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < nst; j++) {
                if ((i+1) % 2 != 0) {
                    System.out.print("1");
                } else {
                    if ( j==0 || j==nst-1) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                }
            }
            System.out.println();
            nst += 1;
        }
    }
}
