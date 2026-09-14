
import java.util.Scanner;
public class PrimeNumbers {

    public static void main(String[] args)
    {
        checkPrimeNumber();
    }
    public static void checkPrimeNumber() {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n=sc.nextInt();

        boolean isPrime = true;

        if(n <= 1){
            isPrime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if(n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("Not prime");
        }
        sc.close();
    }
}
