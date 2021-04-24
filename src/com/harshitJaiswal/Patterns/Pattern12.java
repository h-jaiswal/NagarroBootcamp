package com.harshitJaiswal.Patterns;

import java.util.Scanner;

public class Pattern12  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int lines = n;
        int nst = 1;
        int nsp = n-1;

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < nsp; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < nst; j++) {
                if ( j % 2 == 0) {
                    System.out.print("*\t");
                } else {
                    System.out.print("!\t");
                }
            }
            System.out.println();

            nst += 2;
            nsp -= 1;
        }
    }
}
