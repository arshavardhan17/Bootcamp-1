/*
B. Print First 5 Alphabets
time limit per test
1 second
memory limit per test
256 megabytes

Your task is to print the first five letters of the English alphabet.
Input

There is no input for this problem.
Output

Print the first five uppercase English letters, one per line.
Example
Input
Copy

There is no input.

Output
Copy

A
B
C
D
E
 */

public class B_First5UppercsaeAlphabets {
    public static void main(String[] args) {
        char alphabet ='A';
        for(int i=0;i<5;i++){
            System.out.println(alphabet);
            alphabet++;
        }
    }
}
