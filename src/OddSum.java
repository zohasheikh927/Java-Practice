 import java.util.*;
public class OddSum {
    public static int Oddsum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

        System.out.print("Enter n:");
    int n = sc.nextInt();

        System.out.println("Sum of odd numbers=" + Oddsum(n));
    }
}






