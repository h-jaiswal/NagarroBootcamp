package com.harshitJaiswal.Patterns;

public class Pattern32 {
    public static void main(String[] args) {
        int n = 5;
        int lines = 2 * n -1;

        int nst = 1;
        int term = 1;

        for (int i = 0; i < lines; i++) {

            for (int j = 0; j < nst; j++) {
                if (j % 2 == 0) {
                    System.out.print(term + "\t");
                } else {
                    System.out.print("*" + "\t");
                }
            }

            System.out.println();

            if (i < lines/2) {
                nst += 2;
                term += 1;
            } else {
                nst -= 2;
                term -= 1;
            }
        }
    }

}

