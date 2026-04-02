/*
G. Print Primes from 1 to N
time limit per test
1 second
memory limit per test
256 megabytes

You are given an integer N

.

Print all prime numbers from 1
to N in increasing order by writing a function that takes N

as a parameter and prints the required primes.
Input

The only line contains an integer N
(1≤N≤103

).
Output

Print all prime numbers from 1
to N

in increasing order, separated by single spaces.

If there is no prime number in the range, print nothing.
Example
Input
Copy

10

Output
Copy

2 3 5 7
*/

import java.util.Scanner;

public class G_Prime_from_1_to_n {
    public static boolean ISPrime(int num){
        int count=1;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=2;i<=n;i++ ){
            if(ISPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
