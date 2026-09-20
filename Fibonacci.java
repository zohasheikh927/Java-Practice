import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        fibonacciSeries();
    }
    public static void fibonacciSeries() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of terms:" );
        int n= sc.nextInt();

        int a=0;
        int b=1;

        System.out.print(a + " " + b + " ");

        for (int i = 3; i <=n ; i++) {
            int next=a+b;
            System.out.println(next + " ");

            a=b;
            b=next;
        }
        sc.close();

    }
}
