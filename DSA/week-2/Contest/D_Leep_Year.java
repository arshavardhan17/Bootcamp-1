/*

D. Leap Year
time limit per test
1 second
memory limit per test
256 megabytes

To check whether a year is a leap year, follow these rules:

    First check if the year is divisible by 100

. If it is, then it must also be divisible by 400
to be a leap year.
If the year is not divisible by 100
, then it is a leap year if it is divisible by 4

    .

You are given a year Y

. Determine whether it is a leap year or not.
Input

The only line contains an integer Y
(1600≤Y≤9000

).
Output

Print Yes if the year is a leap year, otherwise print No.
Examples
Input
Copy

2000

Output
Copy

Yes

Input
Copy

2004

Output
Copy

Yes

Input
Copy

2100

Output
Copy

No
*/

import java.util.Scanner;

public class D_Leep_Year {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();

        if(n%100==0&&n%400==0){
            System.out.println("Yes");
        }else if(n%100!=0&&n%4==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
