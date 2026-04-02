/*
P. Numbered Traingle
time limit per test
1 second
memory limit per test
256 megabytes

You are given a positive integer n

.

Print a pyramid of n
rows, where the i-th row (1≤i≤n) consists of the digit i

.
Input

The input contains a single integer n
(1≤n≤200

).
Output

Print the numbered pyramid with n

rows.
Examples
Input
Copy

5

Output
Copy

1
22
333
4444
55555

Input
Copy

6

Output
Copy

1
22
333
4444
55555
666666

 */

import java.util.Scanner;

public class P_Numbered_pyramid {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
