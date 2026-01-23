import java.util.*;

public class Reverse {
    public static void main(String[] args) {

        int num = 0012;
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed number: " + rev);
    }
}
//Numbers starting with 0 are interpreted as octal in Java.
//0012 (octal) = 10 (decimal)
// 10 → reverse → 01 → output = 1

//0    0    1    2
//8³   8²   8¹   8⁰

