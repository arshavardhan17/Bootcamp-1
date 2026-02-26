import java.util.Scanner;

public class D_Max_ele_value {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max_ele=Integer.MIN_VALUE;
        int max_pos=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max_ele){
                max_ele=arr[i];
                max_pos=i+1;
            }
        }
        System.out.print(max_ele+" "+max_pos);
    }
}
