/*
A. 2-Stars
time limit per test
1 second
memory limit per test
256 megabytes

You are given a positive integer n

.

Print a pattern consisting of n

rows, where each row contains exactly two stars ('**').
Input

The input contains a single integer n
(1≤n≤2⋅105)

.
Output

Print n

lines. Each line must contain exactly two stars ('**').
Examples
Input
Copy

5

Output
Copy

**
**
**
**
**

Input
Copy

3

Output
Copy

**
**
**
 */

import java.util.Scanner;

public class A_Two_Stars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
