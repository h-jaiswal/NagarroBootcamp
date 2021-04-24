package com.harshitJaiswal.Assignment4;

import java.util.Scanner;

public class PatternTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int lines = n;

        int nst = 1;
        int nsp = n - 1;

        for (int i = 0; i < lines; i++) {

            for (int j = 0; j < nsp; j++) {
                System.out.print("\t");
            }

            int term = i+1;
            for (int j = 0; j < nst; j++) {
                System.out.print(term + "\t");
                if ( j < nst/2 ) {
                    term += 1;
                } else {
                    term -= 1;
                }
            }
            System.out.println();
            nst += 2;
            nsp -= 1;
        }
    }
}
