/*
H1. Calculator
time limit per test
1 second
memory limit per test
256 megabytes

You are given two integers N
and M

. Your task is to compute and print the results of the following operations:

    N+M

    N−M
    N×M
    N÷M
    (integer division)
    NmodM

    Input

    A single line containing two integers N
    and M (1≤N,M≤1000)

    .
    Output

    Print five lines in the format as shown in the example.
    Example
    Input
    Copy

    6 4

    Output
    Copy

    6 + 4 = 10
    6 - 4 = 2
    6 * 4 = 24
    6 / 4 = 1
    6 % 4 = 2

    */


   import java.util.Scanner;
public class H1_Caliculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        System.out.println(n+" + "+m+" = "+(n+m));
        System.out.println(n+" - "+m+" = "+(n-m));
        System.out.println(n+" * "+m+" = "+(n*m));
        System.out.println(n+" / "+m+" = "+(n/m));
        System.out.println(n+" % "+m+" = "+(n%m));
    }
}
