/*
B. Print N to 1
time limit per test
1 second
memory limit per test
256 megabytes

You are given an integer N
. Print all integers from N to 1

in decreasing order.
Input

Print N
integers from N to 1

, separated by spaces.
Output

Print N
integers from N to 1

, separated by spaces.
Examples
Input
Copy

5

Output
Copy

5 4 3 2 1

Input
Copy

4

Output
Copy

4 3 2 1
 */

import java.util.Scanner;

public class B_Print_n_to_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=n;i>=1;i--){
            System.out.print(i+" ");
        }
    }
}
