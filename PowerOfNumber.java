import java.util.Scanner;
public class PowerOfNumber {
    public static void main (String[] args) {
        findPower();
    }
    public static void findPower() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter base :");
        int base = sc.nextInt();

        System.out.println("Enter power :");
        int n = sc.nextInt();


        int result =1;
        for (int i = 1; i <=n ; i++) {
            result = result * base ;
        }
        System.out.println("Answer is :" + result);
        sc.close();
    }
}
