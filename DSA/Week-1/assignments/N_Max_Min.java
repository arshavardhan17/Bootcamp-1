/*
N. Max and Min of 2 Numbers
time limit per test
1 second
memory limit per test
256 megabytes

You are given two integers A
and B

. Your task is to find the minimum and maximum among them.
Input

A single line containing two integers A
and B (1≤A,B≤109)

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

12 9

Output
Copy

Min = 9
Max = 12
 */

import java.util.Scanner;

public class N_Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();

        long min = Math.min(A, B);
        long max = Math.max(A, B);

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        sc.close();
    }
}
