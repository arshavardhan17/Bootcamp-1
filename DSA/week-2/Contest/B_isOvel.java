/*
B. Is Vowel?
time limit per test
1 second
memory limit per test
256 megabytes

You are given a lowercase English letter.

Your task is to determine whether the given character is a vowel or not.

Vowels are:
{a,e,i,o,u}

Input

The only line contains a single lowercase English letter.
Output

Print YES if the character is a vowel, otherwise print NO.
Examples
Input
Copy

a

Output
Copy

YES

Input
Copy

b

Output
Copy

NO
 */

import java.util.Scanner;

public class B_isOvel {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String ch=sc.next();
        sc.close();
        if(ch.equals("a")||ch.equals("e")||ch.equals("i")||ch.equals("o")||ch.equals("u")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
