package com.harshitJaiswal.Patterns;

public class Pattern19_2 {
    public static void main(String[] args) {
        int n = 7;
        int lines = n;

        int nsp = n / 2 + 1;
        int nst = -1;
        for (int i = 0; i < lines; i++) {

            for (int j = 0; j < nsp; j++) {
                System.out.print("\t");
            }

            for (int j = 0; j < nst; j++) {
                System.out.print("*\t");
            }

            System.out.println();

            if (i < lines/2) {
                nsp -= 1;
                nst += 2;
            } else {
                nsp += 1;
                nst -= 2;
            }

        }
    }
}
