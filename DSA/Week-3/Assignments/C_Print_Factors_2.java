/*

C. Print Factors - II
time limit per test
1 second
memory limit per test
256 megabytes

You are given an integer N

.

Write a function that prints all factors∗
of N

in decreasing order.

∗
A positive integer d is called a divisor (factor) of N if Nmodd=0

.
Input

The only line contains an integer N
(1≤N≤105

).
Output

Print all factors of N

in decreasing order, separated by single spaces.
Example
Input
Copy

12

Output
Copy

12 6 4 3 2 1
*/

import java.util.Scanner;

public class C_Print_Factors_2 {
public static void factors(int n){
    for(int i=n;i>=1;i--){
        if(n%i==0){
            System.out.print(i+" ");
        }
    }
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    factors(n);
}
}
