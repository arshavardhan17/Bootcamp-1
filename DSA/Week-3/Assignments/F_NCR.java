/*
F. nCr
time limit per test
1 second
memory limit per test
256 megabytes

You are given two integers n
and r

.

Write a function to compute the binomial coefficient:
(nCr)=n!/r!(n−r)!

Input

The only line contains two integers n
and r (0≤r≤n≤10

).
Output

Print the value of (nr)

.
Examples
Input
Copy

5 2

Output
Copy

10

Input
Copy

10 0

Output
Copy

1

*/

import java.util.Scanner;

public class F_NCR {
public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long nCr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(nCr(n, r));
    }
}
