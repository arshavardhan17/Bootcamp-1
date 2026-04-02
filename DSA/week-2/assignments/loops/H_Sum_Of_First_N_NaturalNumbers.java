import java.util.Scanner;

public class H_Sum_Of_First_N_NaturalNumbers {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long sum=(long)n*(n+1)/2;
    System.out.print(sum);
  }
}
