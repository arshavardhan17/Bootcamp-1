/*
H2. Calculator - II
time limit per test
1 second
memory limit per test
256 megabytes

You are given two integers N
and M

. Your task is to compute and print the results of the following operations:

    N+M

N−M
N×M
N÷M
(integer division)
NmodM

Input

Two integers N
and M, each given on a separate line (1≤N,M≤109)

.
Output

Print five results in the following format as shown in the example.
Example
Input
Copy

1000000000
1000000000

Output
Copy

1000000000 + 1000000000 = 2000000000

1000000000 - 1000000000 = 0

1000000000 * 1000000000 = 1000000000000000000

1000000000 / 1000000000 = 1

1000000000 % 1000000000 = 0
 */

import java.util.Scanner;
public class H2_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long m=sc.nextLong();

        System.out.println(n+" + "+m+" = "+(n+m));
        System.out.println();
        System.out.println(n+" - "+m+" = "+(n-m));
        System.out.println();
        System.out.println(n+" * "+m+" = "+(n*m));
        System.out.println();
        System.out.println(n+" / "+m+" = "+(n/m));
        System.out.println();
        System.out.println(n+" % "+m+" = "+(n%m));
        sc.close();
    }
}
