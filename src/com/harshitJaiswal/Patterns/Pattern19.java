package com.harshitJaiswal.Patterns;

public class Pattern19 {
    public static void main(String[] args) {
        int n = 7;
        int lines = n;

        int nst = n / 2 + 1;
        int nsp = -1;
        for (int i = 0; i < lines; i++) {

            for (int j = 0; j < nst; j++) {
                System.out.print("*\t");
            }

            for (int j = 0; j < nsp; j++) {
                System.out.print("\t");
            }

            for (int j = 0; j < ((i==0 || i == lines-1) ? nst - 1: nst); j++) {
                System.out.print("*\t");
            }

            System.out.println();

           if (i < lines/2) {
               nst -= 1;
               nsp += 2;
           } else {
               nst += 1;
               nsp -= 2;
           }

        }
    }
}
