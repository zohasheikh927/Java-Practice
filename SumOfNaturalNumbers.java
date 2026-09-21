import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main (String[] args) {
        NaturalNumbers();
    }
    public static void NaturalNumbers() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number :");
        int n= sc.nextInt();

        int sum=0;

        for (int i = 1; i <= n ; i++) {
            sum=sum+i;
        }
        System.out.println("Sum of natural number is :" +sum);
        sc.close();
    }

}
