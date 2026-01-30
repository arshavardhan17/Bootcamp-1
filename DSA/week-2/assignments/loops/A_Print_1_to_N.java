/*
A. Print 1 to N
time limit per test
1 second
memory limit per test
256 megabytes

You are given a positive integer n

.

Print the integers from 1
to n

(inclusive), each on a separate line.
Input

The input contains a single integer n
(1≤n≤2⋅105)

.
Output

Print n
lines. On the i-th line, output the integer i (1≤i≤n)

.
Examples
Input
Copy

5

Output
Copy

1
2
3
4
5

Input
Copy

2

Output
Copy

1
2
 */

import java.util.Scanner;

public class A_Print_1_to_N {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
