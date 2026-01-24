/*
C. Print All Even Numbers from 1 to N
time limit per test
1 second
memory limit per test
256 megabytes

You are given an integer N
. Print all even numbers between 1 and N

(inclusive) in increasing order.
Input

The first line contains an integer N
(1≤N≤105

).
Output

Print all even numbers between 1
and N

, separated by spaces.

If there is no even number in the given range, print nothing.
Example
Input
Copy

10

Output
Copy

2 4 6 8 10

Note

An integer is even if it is divisible by 2
. */

import java.util.Scanner;

public class C_PrintEven_from_1_to_n {
 public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            if(i%2==0){
              System.out.print(i+" ");
            }
        }
    }
}
