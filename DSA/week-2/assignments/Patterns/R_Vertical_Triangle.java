/*

R. Vertical Traingle
time limit per test
1 second
memory limit per test
256 megabytes

You are given a positive integer n

.

Print a triangle of 2n−1

rows.
Input

The input contains a single integer n
(1≤n≤200

).
Output

Print the vertical triangle of stars, as shown in the example.
Examples
Input
Copy

4

Output
Copy

*
* *
* * *
* * * *
* * *
* *
*

Input
Copy

7

Output
Copy

*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*

*/
/*

R. Vertical Traingle
time limit per test
1 second
memory limit per test
256 megabytes

You are given a positive integer n

.

Print a triangle of 2n−1

rows.
Input

The input contains a single integer n
(1≤n≤200

).
Output

Print the vertical triangle of stars, as shown in the example.
Examples
Input
Copy

4

Output
Copy

*
* *
* * *
* * * *
* * *
* *
*

Input
Copy

7

Output
Copy

*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*

*/


import java.util.Scanner;

public class R_Vertical_Triangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++){
            for(int j=i;j<=n-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}


