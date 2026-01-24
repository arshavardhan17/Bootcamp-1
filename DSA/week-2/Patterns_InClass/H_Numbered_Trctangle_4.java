import java.util.Scanner;

public class H_Numbered_Trctangle_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        char c='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(c);
            }
            c++;
            System.out.println();
        }
    }
}
