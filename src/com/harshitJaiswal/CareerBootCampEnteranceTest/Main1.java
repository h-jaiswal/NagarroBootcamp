package com.harshitJaiswal.CareerBootCampEnteranceTest;

import java.util.ArrayList;
import java.util.Scanner;

/*
*
*
* It's Valentine's Day in Russia today. as we all know number of girls in Russia is more than number of boys 😜 hence boys have an extra advantage while choosing girl for the valentine evening. Each boy has certain number of chocolates and each girl has certain number of candies. Now you being the anchor of evening wants to pair all the boys with girls such that the sum of absolute difference between boy's chocolate and girl's candy in a pair is minimized. Ofcourse some of the girls will remain unpaired but that's okay as we are in Russia 😜

Input Format
The first line consists of two integers N and M. then follow N integers in second line. Then follow M integers in third line. M >= N

Constraints
1 <= N <= 5000
1 <= M <= 5000
M >= N
1 <= chocolates <= 1000000
1 <= candies <= 1000000

Output Format
The only line which consists of required sum of absolute differences.

Sample Input
2 5
4 5
1 2 3 4 5
Sample Output
0
Explanation
we can pair boy numbered 1 with girl numbered 4 and boy numbered 2 with girl numbered 5
*
* */

// WA
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        ArrayList<Long> boys = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boys.add(scanner.nextLong());
        }

        long m = scanner.nextLong();
        ArrayList<Long> girls = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            girls.add(scanner.nextLong());
        }

        long sum = 0;

        System.out.println(girls.size());
        System.out.println(boys.size());
        while (! boys.isEmpty()) {
            int girlPaired = -1;
            long min = Long.MAX_VALUE;

            for (int i = 0; i < girls.size(); i++) {
                long temp = Math.abs(girls.get(i) - boys.get(0));

                if (temp < min) {
                    girlPaired = i;
                    min = temp;
                }
            }
            girls.remove(girlPaired);
            boys.remove(0);
        }


        System.out.println(sum);
    }
}
