/*
J. Inverted Hollow Triangle
time limit per test
1 second
memory limit per test
256 megabytes

You are given a positive integer n

.

Print a inverted hollow triangle pattern consisting of n

rows.
Input

The input contains a single integer n
(1≤n≤2⋅103)

.
Output

Print n

lines, as given in the example.
Examples
Input
Copy

7

Output
Copy

* * * * * * *
 *         *
  *       *
   *     *
    *   *
     * *
      *

Input
Copy

3

Output
Copy

* * *
 * *
  *


*/

import java.util.Scanner;

public class J_Inverted_Hollow_Triangle {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=i;j<=n-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1||j==i||i==n){

                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

    }
}
