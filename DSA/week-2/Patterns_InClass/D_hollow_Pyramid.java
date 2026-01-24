import java.util.Scanner;

public class D_hollow_Pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        sc.close();

        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                if (i == 1 || j == i || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*
*****
*  *
* *
**
*

*/
