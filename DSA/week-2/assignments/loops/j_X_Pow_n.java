import java.util.Scanner;

public class j_X_Pow_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        long ans=1;
        for(int i=0;i<n;i++){
            ans=(long)ans*x;
        }
        System.out.println(ans);
    }
}
