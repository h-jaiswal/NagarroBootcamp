package com.harshitJaiswal.Patterns;

public class Pattern25 {
    public static void main(String[] args) {
        int n = 5;
        int lines = n;

        int term = 1;
        int nst = 1;
        int nsp = n -1;
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < nsp; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < nst; j++) {
                System.out.print(term + "\t");

                term += 1;
            }

            System.out.println();

            nst += 2;
            nsp -= 1;
        }
    }

}
