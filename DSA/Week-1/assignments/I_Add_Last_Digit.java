/*
I. Add Last Digits
time limit per test
1 second
memory limit per test
256 megabytes

You are given two integers N
and M. Your task is to find the sum of the last digits of N and M

.
Input

A single line containing two integers N
and M (1≤N,M≤1000)

.
Output

Print a single integer — the sum of the last digits of N
and M

.
Example
Input
Copy

169 125

Output
Copy

14

 */

import java.util.Scanner;

public class I_Add_Last_Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
       System.out.println((n%10)+(m%10));
       sc.close();
    }
}
