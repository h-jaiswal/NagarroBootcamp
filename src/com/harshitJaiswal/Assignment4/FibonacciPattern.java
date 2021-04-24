package com.harshitJaiswal.Assignment4;

import java.util.Scanner;

public class FibonacciPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int lines = n;

        int nst = 1;

        int a = -1;
        int b = 1;
        int term = a + b;
        ;

        for (int i = 0; i < lines; i++) {


            for (int j = 0; j < nst; j++) {
                System.out.print(term + " ");

                a  = b;
                b = term;
                term = a + b;
            }

            System.out.println();
            nst += 1;
        }
    }
}
