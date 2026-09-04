import java.util.Scanner;

public class Count {
    public static void main (String[] args) {
        CountNumbers();
        }

    public static void CountNumbers() {
        Scanner sc= new Scanner(System.in) ;
        System.out.println("Enter the numbers:");
        int n = sc.nextInt();

        int count=0;
        while(n > 0){
            count++;
            n=n/10;
        }
            System.out.println("Digits:"+ count);
        sc.close();
    }

}
