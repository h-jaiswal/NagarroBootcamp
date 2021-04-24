package com.harshitJaiswal.Assignment4;

import java.util.Scanner;

public class PascalTriangle {
    static int factorial(int n) {
        int f;

        for(f = 1; n > 1; n--){
            f *= n;
        }
        return f;
    }
    static int ncr(int n,int r) {
        return factorial(n) / ( factorial(n-r) * factorial(r) );
    }
    public static void main(String args[]){
        int n, i, j;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt() - 1;

        for(i = 0; i <= n; i++) {
            for(j = 0; j < n-i; j++){
                System.out.print("    ");
            }
            for(j = 0; j <= i; j++){
                System.out.print(String.format("%8d", ncr(i, j)));
            }
            System.out.println();
        }
    }
}