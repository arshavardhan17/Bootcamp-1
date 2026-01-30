/*

D. Check Prime
time limit per test
1 second
memory limit per test
256 megabytes

You are given an integer N

.

Write a function that checks whether N

is a prime number.

Print Prime if N

is prime, otherwise print Not Prime.
Input

The only line contains an integer N
(1≤N≤105

).
Output

Print Prime or Not Prime.
Examples
Input
Copy

17

Output
Copy

Prime

Input
Copy

4

Output
Copy

Not Prime

*/

import java.util.Scanner;

public class D_Check_Prime {
    public static void checkPrime(int n){
        int count =0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        checkPrime(n);

    }
}
