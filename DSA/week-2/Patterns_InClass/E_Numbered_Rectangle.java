import java.util.Scanner;

public class E_Numbered_Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/*
1111111
2222222
3333333
4444444
5555555 */
