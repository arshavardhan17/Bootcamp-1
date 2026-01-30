/*

I. Hollow Triangle
time limit per test
1 second
memory limit per test
256 megabytes

You are given a positive integer n

.

Print a hollow triangle pattern consisting of n

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

6

Output
Copy

     *
    * *
   *   *
  *     *
 *       *
* * * * * *

Input
Copy

4

Output
Copy

   *
  * *
 *   *
* * * *
*/

import java.util.Scanner;

public class I_Hollow_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
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
