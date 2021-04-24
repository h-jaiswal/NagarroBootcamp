package com.harshitJaiswal.Assignment4;

import java.util.Scanner;

public class PatternMagic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        int n = scanner.nextInt();

        int lines = 2 * n - 1;
        int nst = n;
        int nsp = -1;

        for (int i = 0; i < lines; i++) {

            for (int j = 0; j < nst; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < nsp; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i==0 || i==lines-1 ? nst-1: nst); j++) {
                System.out.print("*");
            }
            System.out.println();
            if ( i < lines/2 ) {
                nst -= 1;
                nsp += 2;
            } else {
                nst += 1;
                nsp -= 2;
            }
        }
    }
}
