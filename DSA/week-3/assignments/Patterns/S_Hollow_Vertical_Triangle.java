/*
S. Inverted Vertical Triangle
time limit per test
1 second
memory limit per test
256 megabytes

You are given a positive integer n

.

Print a hollow triangle of 2n−1

rows.
Input

The input contains a single integer n
(1≤n≤200

).
Output

Print the inverted vertical triangle of stars, as shown in the example.
Examples
Input
Copy

5

Output
Copy

*
* *
*   *
*     *
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

*
* *
*   *
* *
*

 */

import java.util.Scanner;

public class S_Hollow_Vertical_Triangle {
   public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1||j==i){

                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++){
            for(int j=i;j<=n-1;j++){
                if(j==n-1||j==1||j==i){

                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
