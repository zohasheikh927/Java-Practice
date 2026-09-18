import java.util.Scanner;
class sumofdigits {
  public static void SumOfDigits() {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();

        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
      System.out.println("Sum of digits:" +sum);
        sc.close();
    }

        public static void main (String[] args)
        {
           SumOfDigits();
        }


    }


