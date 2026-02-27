import java.util.Scanner;

public class J_Arrange_The_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int [] arr=new int[n];
            int i=0;
            int j=arr.length-1;
            int count=1;
            while(i<j){
                arr[i]=count++;
                arr[j]=count++;
                i++;
                j--;
            }
            if(i==j){
                arr[i]=count;
            }
            for (int value : arr) {
                System.out.print(value+" ");
            }
            System.out.println();
            }
        }
    }


/*

import java.util.Scanner;

public class J_Arrange_The_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            for(int i = 1; i <= n; i++) {
                if(i % 2 == 1) {
                    System.out.print(i + " ");
                }
            }

            for(int i = n; i >= 1; i--) {
                if(i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }

            System.out.println();
        }
    }
}
    */
