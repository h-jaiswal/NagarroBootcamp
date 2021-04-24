package com.harshitJaiswal.Assignment4;

import java.util.Scanner;

public class PatternMountain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int lines = n;
        int nst = 1;
        int nsp = 2 * n - 3;

        String space = "\t";

        for (int i = 0; i < lines; i++) {
            int term = 1;

            for (int j = 0; j < nst; j++) {
                System.out.print(term + "\t");
                term += 1;
            }

            for (int j = 0; j < nsp; j++) {
                System.out.print(space);
            }
            if (nsp <= 0) {
                term -= 1;
            }
            for (int j = 0; j < ( nsp <= 0 ? nst - 1 : nst ); j++) {
                term -= 1;
                System.out.print(term + "\t");
            }

            System.out.println();

            nst += 1;
            nsp -= 2;
        }
    }
}
