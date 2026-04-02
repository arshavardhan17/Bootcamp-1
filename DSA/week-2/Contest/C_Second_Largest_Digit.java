/*

C. Second Last Digit
time limit per test
1 second
memory limit per test
256 megabytes

You are given an integer N

.

Your task is to print the second last digit of N

.
Input

The only line contains an integer N
(10≤N≤105

).
Output

Print a single digit — the second last digit of N

.
Examples
Input
Copy

42

Output
Copy

4

Input
Copy

10

Output
Copy

1

*/

import java.util.Scanner;

public class C_Second_Largest_Digit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();
        sc.close();

        n=n/10;
         int rem =n%10;
        System.out.println(rem);
    }
}
