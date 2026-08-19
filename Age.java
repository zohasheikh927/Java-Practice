import java.util.*;
public class Age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n>=18){
            System.out.println("Person is eligible to vote");
        } else {
            System.out.println("Not eligible");
        }



    }
}
