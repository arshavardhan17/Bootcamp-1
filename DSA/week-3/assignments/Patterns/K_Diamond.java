/*
K. Diamond
time limit per test
1 second
memory limit per test
256 megabytes

You are given a positive integer n

.

Print a diamond pattern consisting of 2n−1
rows. The first n rows form the upper triangle. The next n−1

rows form the lower triangle.
Input

The input contains a single integer n
(1≤n≤200)

.
Output

Print the diamond consisting of 2n−1

rows.
Examples
Input
Copy

3

Output
Copy

  *
 * *
* * *
 * *
  *

Input
Copy

5

Output
Copy

    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *


*/

import java.util.Scanner;

public class K_Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper half
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                if (j < i) System.out.print(" ");
            }

            System.out.println();
        }
    }
}


