/*
L. Multiple
time limit per test
1 second
memory limit per test
256 megabytes

You are given two integers N
and M. Your task is to check whether M is a multiple of N

.

A number M
is said to be a multiple of N if M is divisible by N

.
Input

A single line containing two integers N
and M (1≤N,M≤109)

.
Output

Print:

    Yes if M

is a multiple of N

    No otherwise

Example
Input
Copy

6 36

Output
Copy

Yes
 */

import java.util.Scanner;
public class L_Multiple {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        sc.close();
        if (M % N == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
