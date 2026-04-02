/*
F. Hollow Square
time limit per test
1 second
memory limit per test
256 megabytes

You are given a positive integer n

.

Print a hollow square pattern consisting of n

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

******
*    *
*    *
*    *
*    *
******

Input
Copy

2

Output
Copy

**
**

Input
Copy

8

Output
Copy

********
*      *
*      *
*      *
*      *
*      *
*      *
********

 */

import java.util.Scanner;

public class F_Hollow_Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==n||j==n){

                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
