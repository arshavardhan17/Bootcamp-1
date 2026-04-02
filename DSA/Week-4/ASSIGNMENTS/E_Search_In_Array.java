import java.util.Scanner;

public class E_Search_In_Array {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int target=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int value:arr){
            if(value==target){
            count++;
        }
        }
        if(count!=0){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}
