/*
G. Print Table of N
time limit per test
1 second
memory limit per test
256 megabytes

You are given an integer N
. Your task is to print the multiplication table of N from 1 to 10

.
Input

A single integer N
(1≤N≤100)

.
Output

Print the table of N

in the format shown in the example below.
Example
Input
Copy

6

Output
Copy

6 * 1 = 6
6 * 2 = 12
6 * 3 = 18
6 * 4 = 24
6 * 5 = 30
6 * 6 = 36
6 * 7 = 42
6 * 8 = 48
6 * 9 = 54
6 * 10 = 60
 */


import java.util.Scanner;

public class G_TableOf_N {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
