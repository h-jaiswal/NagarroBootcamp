package com.harshitJaiswal.Assignment4;

import java.util.Scanner;

public class InvertedHourGlass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int lines = 2*n + 1;

        int nst = 1;
        int nsp = 2 * n - 1;


        for (int i = 0; i < lines; i++) {

            int term = n;
            for (int j = 0; j < nst; j++) {
                System.out.print( term-- + " ");
            }

            for (int j = 0; j < nsp; j++) {
                System.out.print("  ");
            }

            if (i == lines/2) {
                term++;
            }
            for (int j = 0; j < (i == lines/2 ? nst-1 : nst); j++) {

                System.out.print( ++term + " ");
            }

            System.out.println();

            if (i < lines/2) {
                nst += 1;
                nsp -= 2;
            } else {
                nst -= 1;
                nsp += 2;
            }

        }
    }
}
