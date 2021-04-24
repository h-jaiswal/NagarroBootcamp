package com.harshitJaiswal.Assignment4;

import java.util.Scanner;

public class HollowRhombusPatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int lines = n;
        int nst = n;
        int nsp = n-1;

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < nsp; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < nst; j++) {
                if (i == 0 || i == lines-1) {
                    System.out.print("*");
                } else {
                    if (!(j == 0 || j == nst-1)) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();

            nsp = nsp-1;
        }
    }
}
