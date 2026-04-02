/*
K. Factor
time limit per test
1 second
memory limit per test
256 megabytes

You are given two integers N
and F. Your task is to check whether F is a factor of N

.

A number F
is said to be a factor of N if N is divisible by F

.
Input

A single line containing two integers N
and F (1≤N,F≤109)

.
Output

Print:

    Yes if F

is a factor of N

    No otherwise

Example
Input
Copy

36 6

Output
Copy

Yes

 */


import java.util.Scanner;

public class K_Factor {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
            int n=sc.nextInt();
            int m=sc.nextInt();
            sc.close();

            System.out.println((n%m==0)? "Yes":"No");
    }

}
