//Writing a function that calculates the Greatest Common Divisor of 2 numbers.
import java.util.*;
public class GreatestCommonDivisor {
    static int gcd(int a, int b) {
        int result = 1;

        for (int i = 1; i<=a && i<=b; i++) {
            if (a % i == 0 && b % i == 0) {
                result = i;
            }
        }
        return result;
    }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a =sc.nextInt();
            int b =sc.nextInt();

            System.out.println("GCD="+ gcd(a ,b));
        }


    }
