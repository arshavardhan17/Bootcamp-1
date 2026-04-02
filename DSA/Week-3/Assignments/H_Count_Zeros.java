/*
H. Count Zeros
time limit per test
1 s.
memory limit per test
256 MB

You are given a non-negative integer N

.

Find the number of digits equal to 0 in the decimal representation of N
by writing a function that takes N

as a parameter and returns the count of zero digits.
Input

The only line contains an integer N
(0≤N≤1018

).
Output

Print a single integer — the count of zeros in N

.
Examples
Input
Copy

102030

Output
Copy

3

Input
Copy

0

Output
Copy

1

*/

import java.util.Scanner;

public class H_Count_Zeros {
    public static int countZeros(long num){
        int count=0;
        while(num>0){
            long rem =num%10;
            if(rem==0){
                count++;
            }
            num=num/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();

        System.out.println(countZeros(num));
    }
}
