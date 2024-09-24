import java.util.Scanner;

public class QuadraticClass {
    public static void main(String[] args) {
        // Initialise scanner to read input
        Scanner input = new Scanner(System.in);

        // Get input for a, b and c from user
        System.out.println("Welcome to the quadratic equation solver!");
        System.out.println("Please input a: ");
        double a = input.nextDouble();
        System.out.print("Please input b: ");
        double b = input.nextDouble();
        System.out.print("Please input c: ");
        double c = input.nextDouble();

        // Calculate the discriminant
        double discriminant = (b * b) - (4 * a * c);

        // Check if discrimant > 0, == 0 or < 0
        if (discriminant > 0.0) {
            double root1 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
            double root2 = (b + Math.pow(discriminant, 0.5)) / (2.0 * a);
        }
        else if (discriminant == 0) {
            double root = -b / (2.0 * a);
        }
        else {
            System.out.println("The equation has no real roots");
        }

    }
}
