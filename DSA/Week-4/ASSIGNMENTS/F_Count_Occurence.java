import java.util.Scanner;

public class F_Count_Occurence {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        int[] arr = new int[N];   // Array declaration

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();   // Storing elements in array
        }

        int count = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] == X) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}

