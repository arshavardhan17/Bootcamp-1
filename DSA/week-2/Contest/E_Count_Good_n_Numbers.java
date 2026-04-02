/*

E. Count Good Numbers
time limit per test
1 second
memory limit per test
256 megabytes

You are given an integer N
and then N

integers.

Count how many of these numbers are good.

A number x

is said to be good if:

    x

is a factor of 18 (i.e., 18modx=0
), or
x
is a multiple of 45 (i.e., xmod45=0

    ).

Input

The first line contains an integer N
(1≤N≤105

).

The second line contains N
integers x1,x2,…,xN (0≤xi≤109

).
Output

Print a single integer: the number of good integers among the N

given numbers.
Example
Input
Copy

8
1 2 3 4 5 6 9 90

Output
Copy

6

Note

For x=0
, it cannot be a factor of 18 (division by zero is undefined), but it is a multiple of 45 because 0mod45=0.*/

import java.util.Scanner;

public class E_Count_Good_n_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if ((x != 0 && 18 % x == 0) || (x % 45 == 0)) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}

