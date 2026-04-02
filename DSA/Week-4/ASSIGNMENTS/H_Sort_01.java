import java.util.Scanner;

public class H_Sort_01 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         while(t-- > 0) {
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
