import java.util.Scanner;

public class F_Count_Numbers {
 public static void main(String[]args) {
 Scanner scanner = new Scanner(System.in);

 int N = scanner.nextInt();

 int[] numbers = new int[N];
 for (int i = 0; i < N; i++) {
 numbers[i] = scanner.nextInt();
 }

 // Count properties
 int positive = 0, negative = 0, even = 0, odd = 0;
 for (int num : numbers) {
 if (num > 0) positive++;
 else if (num < 0) negative++;
 if (num % 2 == 0) even++;
 else odd++;
 }

 System.out.println(positive + " " + negative + " " + even + " " + odd);
 scanner.close();
 }
}
