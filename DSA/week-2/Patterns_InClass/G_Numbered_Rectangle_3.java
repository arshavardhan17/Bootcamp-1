import java.util.Scanner;

public class G_Numbered_Rectangle_3 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        for(int i=1;i<=n;i++){
            char c='A';
            for(int j=1;j<=m;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}

/*
ABCDEFG
ABCDEFG
ABCDEFG
ABCDEFG
ABCDEFG
*/
