import java.util.Scanner;

public class O_Pair_Sum {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target =sc.nextInt();
        int count =0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    }
}

/*
// optimal
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int X = sc.nextInt();

            HashMap<Integer, Integer> freq = new HashMap<>();
            long count = 0;

            for (int num : arr) {
                int needed = X - num;

                if (freq.containsKey(needed)) {
                    count += freq.get(needed);
                }

                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }

            System.out.println(count);
        }

        sc.close();
    }
}
*/
