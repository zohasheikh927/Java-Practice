import java.util.*;

public class Circle {

    public static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        System.out.println("Circumference = " + circumference(radius));
    }
}
