package com.harshitJaiswal.Patterns;

public class Pattern29 {
    public static void main(String[] args) {
        int n = 5;
        int lines = n;

        int nst = 1;
        int nsp = n - 1;
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < nsp; j++) {
                System.out.print("\t");
            }

            int term = -1;
            for (int j = 0; j < nst; j++) {
                if (j == 0 || j == nst-1) {
                    term = i+1;
                } else {
                    term = 0;
                }
                System.out.print(term + "\t");
            }

            System.out.println();

            nst += 2;
            nsp -= 1;
        }
    }

}
