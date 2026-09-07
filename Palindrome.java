import java.util.Scanner;
public class Palindrome {
    public static void main (String[] args) {
        CheckPalindrome();

    }
    public static void CheckPalindrome() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int original=n;
        int palindrome=0;
        while(n > 0) {
            int digit=n % 10;
            palindrome=palindrome * 10 + digit;
            n=n/10;
        }
        if(original==palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
