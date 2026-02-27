import java.util.HashMap;
import java.util.Scanner;

public class M_Find_Duplicate_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int []arr=new int[n];
            HashMap<Integer,Integer> freq=new HashMap<>();
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                freq.put(arr[i],freq.getOrDefault(arr[i], 0)+1);
            }
            for (HashMap.Entry<Integer, Integer> entry : freq.entrySet()){
                int key=entry.getKey();
                int val =entry.getValue();
                if(val>1){
                    System.out.print(key);
                    break;
                }
            }
            System.out.println();
        }
    }
}
