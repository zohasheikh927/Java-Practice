import java.util.*;

public class GreaterNumber {

    public int greater(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        GreaterNumber obj = new GreaterNumber();

        System.out.println(obj.greater(a, b));
    }
}