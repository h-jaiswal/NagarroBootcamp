package com.harshitJaiswal.Assignment4;

import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int lines = 2*n + 1;

        int nst = 2 * n + 1;
        int nsp = 0;
        int term = 5;

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < nsp; j++) {
                System.out.print("  ");
            }

            int term2 = term;
            for (int j = 0; j < nst; j++) {
                if ( j < nst/2 ) {
                    System.out.print( term2-- + " ");
                } else {
                    System.out.print( term2++ + " ");
                }
            }

            System.out.println();

            if (i < lines/2) {
                nst -= 2;
                nsp += 1;
                term -= 1;
            } else {
                nst += 2;
                nsp -= 1;
                term += 1;
            }

        }
    }
}
