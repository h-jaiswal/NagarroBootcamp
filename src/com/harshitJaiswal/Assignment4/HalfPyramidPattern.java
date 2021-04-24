package com.harshitJaiswal.Assignment4;

import java.util.Scanner;

public class HalfPyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int lines = n;
        int nst = 1;
        for (int i = 0; i < lines; i++) {
            int term = 1;

            for (int j = 0; j < nst; j++) {
                System.out.print(term++ + " ");
            }
            System.out.println();
            nst += 1;
        }
    }
}
