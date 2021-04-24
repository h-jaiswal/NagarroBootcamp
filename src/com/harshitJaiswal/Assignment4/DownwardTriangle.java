package com.harshitJaiswal.Assignment4;

import java.util.Scanner;

public class DownwardTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int lines = n;
        int nst = n;
        int nsp = 0;

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < nsp; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < nst; j++) {
                System.out.print("* ");
            }
            System.out.println();
            nst -= 1;
            nsp += 1;
        }
    }
}
