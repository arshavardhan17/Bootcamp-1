import java.util.Scanner;

public class K_Swap_Alternative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int []arr=new int [n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int i=1;
            while(i<n){
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
                i+=2;
            }
            for (int val : arr) {
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
