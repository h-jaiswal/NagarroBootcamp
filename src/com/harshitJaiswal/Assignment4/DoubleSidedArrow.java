package com.harshitJaiswal.Assignment4;

import java.util.Scanner;

public class DoubleSidedArrow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        int n = scanner.nextInt();

        int lines = n;

        int nst = 1;
        int nsp = n - 1;
        int nspc = -1;
        int term2 = 1;

        for (int i = 0; i < lines; i++) {

            for (int j = 0; j < nsp; j++) {
                System.out.print("  ");
            }

            int term = term2;
            for (int j = 0; j < nst; j++) {
                System.out.print( term-- + " ");
            }

            for (int j = 0; j < nspc; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < (i==0 || i==lines-1 ? nst-1 : nst); j++) {
                System.out.print( ++term + " ");
            }

            System.out.println();

            if (i < lines/2) {
                nst += 1;
                nsp -= 2;
                nspc += 2;
                term2 += 1;
            } else {
                nst -= 1;
                nsp += 2;
                nspc -= 2;
                term2 -= 1;
            }
        }
    }
}
