import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        findLCM();
    }
    public static void findLCM() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int lcm=1;
        for (int i = 1; i <= a * b ; i++) {
            if (i % a ==0 && i % b ==0){
                lcm=i;
                break;
            }
        }
        System.out.println("LCM is :" +lcm);
        sc.close();
    }
}
