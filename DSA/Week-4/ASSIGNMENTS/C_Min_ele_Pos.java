import java.util.Scanner;

public class C_Min_ele_Pos {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min_ele=Integer.MAX_VALUE;
        int min_pos=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min_ele){
                min_ele=arr[i];
                min_pos=i+1;
            }
        }
        System.out.print(min_ele+" "+min_pos);
    }
}
