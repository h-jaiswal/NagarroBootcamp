package com.harshitJaiswal.Patterns;

public class Pattern33 {
        public static void main(String[] args) {
            int n = 10;
            int lines = n;

            int nst = 1;
            int nsp = n - 1;
            for (int i = 0; i < lines; i++) {
                for (int j = 0; j < nsp; j++) {
                    System.out.print("\t");
                }

                int term = lines - i;
                for (int j = 0; j < nst; j++) {

                    if (j < nst/2) {
                        System.out.print(term + "\t");
                        term += 1;
                    } else  if ( j == nst/2) {
                        System.out.print(0 + "\t");
                        term -= 1;
                    } else {
                        System.out.print(term + "\t");
                        term -= 1;
                    }
                }

                System.out.println();

                nst += 2;
                nsp -= 1;
            }
        }

    }
