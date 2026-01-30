/*

A. Hello Functions
time limit per test
1 second
memory limit per test
256 megabytes

You are given an integer N

.

Write a function that takes N
as a parameter and prints the string I am learning functions exactly N

times, each on a new line.
Input

The only line contains an integer N
(1≤N≤1000

).
Output

Print N

lines. Each line must be exactly:
I am learning functions
Example
Input
Copy

3

Output
Copy

I am learning functions
I am learning functions
I am learning functions
*/

import java.util.Scanner;

public class A_Hello_Function {

    public static void Hello(int n){
        for(int i=0;i<n;i++){
            System.out.println("I am learning functions");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        Hello(n);
    }
}
