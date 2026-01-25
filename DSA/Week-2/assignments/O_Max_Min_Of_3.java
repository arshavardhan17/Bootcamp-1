/*
O. Max and Min of 3 Numbers
time limit per test
1 second
memory limit per test
256 megabytes

You are given three integers A
, B, and C

. Your task is to find the minimum and maximum among them.
Input

A single line containing three integers A
, B, and C (1≤A,B,C≤109)

.
Output

Print two lines:

    Min = X
    Max = Y

where X
is the minimum value and Y

is the maximum value.
Example
Input
Copy

12 9 15

Output
Copy

Min = 9
Max = 15
 */

import java.util.Scanner;

public class O_Max_Min_Of_3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long c=sc.nextLong();

        long min = Math.min(A, B);
        long finalmin =Math.min(min,c);
        long max = Math.max(A, B);
        long finalmax =Math.max(max,c);

        System.out.println("Min = " + finalmin);
        System.out.println("Max = " + finalmax);
        sc.close();
    }
}
