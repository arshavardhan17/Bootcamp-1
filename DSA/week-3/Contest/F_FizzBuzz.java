/*

F. FizzBuzz
time limit per test
1 second
memory limit per test
256 megabytes

You are given an integer N

.

Print the numbers from 1
to N

following the rules below:

    If the number is divisible by 3

, print Fizz.
If the number is divisible by 5
, print Buzz.
If the number is divisible by both 3
and 5

    , print FizzBuzz.
    Otherwise, print the number itself.

Each output should be printed on a new line.
Input

The only line contains an integer N
(1≤N≤105

).
Output

Print N

lines according to the rules above.
Example
Input
Copy

15

Output
Copy

1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
*/


import java.util.Scanner;

public class F_FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }

        }
    }
}
