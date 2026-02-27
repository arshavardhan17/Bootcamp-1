import java.util.Scanner;

public class G_Check_If_ArrayIs_Sorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                count++;
            }
        }
        if(count==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
