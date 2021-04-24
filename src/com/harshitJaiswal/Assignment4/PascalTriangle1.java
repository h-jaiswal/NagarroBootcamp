package com.harshitJaiswal.Assignment4;

import java.util.Scanner;

public class PascalTriangle1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // temp variable
        int a = 0;
        // for negative numbers
        if(n <= 0)
            System.out.println("Enter Positive Number");
        for(int i=1; i <= n; i++) {
            // in each iteration start with 1
            a = 1;
            // print number
            for(int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                // update variable
                a = a * (i-j) / j;
            }
            // new line
            System.out.println();
        }

        scan.close();
    }
}
