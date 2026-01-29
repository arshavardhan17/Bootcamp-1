/*

A. Hello Codeforces
time limit per test
1 s.
memory limit per test
256 MB

You are given an integer N
. Print the message Hello Codeforces exactly N

times.

Along with the message, also print the line number starting from 1

.

Each message must be printed on a new line.
Input

The only line contains an integer N
(1≤N≤1000

).
Output

Print N
lines. The i

-th line should be:
Hello Codeforces i
where i starts from 1
.
Example
Input
Copy

3

Output
Copy

Hello Codeforces 1
Hello Codeforces 2
Hello Codeforces 3

*/

import java.util.Scanner;

public class A_HelloCodeForces {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Hello Codeforces "+ i);
        }
    }
}
