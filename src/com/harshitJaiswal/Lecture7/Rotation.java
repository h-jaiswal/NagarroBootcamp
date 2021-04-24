package com.harshitJaiswal.Lecture7;

import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        System.out.print("Enter a number: ");
        long number = scanner.nextLong(); scanner.nextLine();

//        Calculate length of a number using for loop O(n) where n is the number of digits
        byte length = 0;
        for (long i = number; i > 0 ; i = i / 10) {
            length++;
        }

//      Rotate a long type value
//      A positive value means rotate to right and negative means rotate to left

        System.out.print("Rotate by (+ for right and - for left): ");
        byte rotateBy = (byte)((scanner.nextLong()) % length); scanner.nextLine();

        if (rotateBy > 0)
        {
            System.out.println("Rotating right by " + rotateBy);
            long part1 = number / (long) (Math.pow(10, rotateBy));
            long part2 = number % (long)(Math.pow(10, rotateBy));

            number = part2 * (long)(Math.pow(10, length-rotateBy)) + part1;
        } else {
            System.out.println("Rotating left by " + (-rotateBy));
            long part1 = number / (long) (Math.pow(10, length + rotateBy));
            long part2 = number % (long)(Math.pow(10, length + rotateBy));

            number = part2 * (long)(Math.pow(10, -rotateBy)) + part1;
        }

        System.out.println(number);

    }
}
