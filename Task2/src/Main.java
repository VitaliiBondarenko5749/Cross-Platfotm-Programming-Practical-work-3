import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first cathetus: ");

        double a = scanner.nextDouble();

        System.out.print("Enter the length of the second cathetus: ");

        double b = scanner.nextDouble();
        double c = Math.hypot(a, b); // обчислюємо гіпотенузу
        double alpha = Math.toDegrees(Math.asin(a/c)); // обчислюємо кут alpha у градусах
        double beta = Math.toDegrees(Math.asin(b/c)); // обчислюємо кут beta у градусах

        System.out.println("\nThe angle alpha is " + alpha + " degrees");
        System.out.println("The angle beta is " + beta + " degrees");
    }
}