import java.util.Scanner;

public class I_HCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while (a != 0 && b != 0) {
    if (a > b) {
        a = a % b;
    } else if (b > a) {
        b = b % a;
    } else {
        break;
    }
}
        if(a==0)
            System.out.println(b);
        else
            System.out.println(a);
    }
}
