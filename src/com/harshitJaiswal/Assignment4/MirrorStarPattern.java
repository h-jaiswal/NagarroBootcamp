package com.harshitJaiswal.Assignment4;

import java.util.Scanner;

public class MirrorStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int lines = n;
        int nst = 1;
        int nsp = n/2;
        String term = "*\t";
        String space = "\t";

        for (int i = 0; i < lines; i++) {

            for (int j = 0; j < nsp; j++) {
                System.out.print(space);
            }

            for (int j = 0; j < nst; j++) {
                System.out.print(term);
            }
            System.out.println();

            if ( i < lines/2) {
                nst += 2;
                nsp -= 1;
            } else {
                nst -= 2;
                nsp += 1;
            }
        }
    }
}
