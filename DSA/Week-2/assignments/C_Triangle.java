/*C. Triangle
time limit per test
1 second
memory limit per test
256 megabytes

Your task is to print a right-angled triangle pattern using asterisks (*).
Input

There is no input for this problem.
Output

Print the following pattern exactly as shown:


*****
****
***
**
*

Example
Input
Copy

There is no input.

Output
Copy

*****
****
***
**
*
 */


public class C_Triangle {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j= 5-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
