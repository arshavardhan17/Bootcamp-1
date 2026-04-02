/*
E. Factorial
time limit per test
1 second
memory limit per test
256 megabytes

You are given an integer N

.

Find the factorial of N
by writing a function that takes N as a parameter and returns N!, where:
N!=1×2×3×⋯×N

Input

The first line contains an integer N
(0≤N≤20

).
Output

Print the value of N!

.
Examples
Input
Copy

5

Output
Copy

120

Input
Copy

7

Output
Copy

5040

Note

    By definition, 0!=1

.
The constraint N≤20
ensures the answer fits in a 64-bit integer.
*/

import java.util.Scanner;

public class E_Factorial {
    public static void factorial(int n){
        if(n==0){
            System.out.println(1);
            return;
        }
        long ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*i;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        factorial(n);

    }
}
