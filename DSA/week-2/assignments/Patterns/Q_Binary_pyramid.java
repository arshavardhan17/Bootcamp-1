/*
Q. Binary Pyramid
time limit per test
1 second
memory limit per test
256 megabytes

You are given a positive integer n

.

Print a pyramid of n

rows. The first row contains a single '0'. From the second row onward, the digits alternate between '1' and '0'.
Input

The input contains a single integer n
(1≤n≤200

).
Output

Print the binary pyramid with n

rows.
Examples
Input
Copy

6

Output
Copy

0
10
010
1010
01010
101010

Input
Copy

2

Output
Copy

0
10
 */


// if the row number is odd we start with 0 and alternate
//if the row number is even we start with 1 and alternate
// to alternate use the concept of odd even by mod 2 it returns only 1 and 0
import java.util.Scanner;

public class Q_Binary_pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            //  caliculating start point
                int start;
                if(i%2==1){
                    start =0;
                }else{
                    start =1;
                }
            for(int j=1;j<=i;j++){
                System.out.print(start%2);
                start++;

                /*
                // caliculate the alternative
                if(start ==0){
                    start=1;
                }else{
                    start =0;
                }
                */
            }
            System.out.println();
        }
    }
}
