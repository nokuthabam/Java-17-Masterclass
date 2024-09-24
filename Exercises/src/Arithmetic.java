import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        // Program to output calculations based on user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        double num1 = scanner.nextInt();
        System.out.print("Please enter a second number: ");
        double num2 = scanner.nextInt();

        // Perform calculations
        double sumOfNums = num1 + num2;
        System.out.println("The sum of the two numbers: " + sumOfNums);

        double diffOfNums = num1 - num2;
        System.out.println("The difference between the numbers: " + diffOfNums);

        double prodOfNums = num1 * num2;
        System.out.println("The product of the two numbers: " + prodOfNums);

        double divNum1Num2 = num1 / num2;
        System.out.println("The first number divided by the second number: " + divNum1Num2);

        double remainder = num1 % num2;
        System.out.println("The remainder when the first number is divided by the second number: " + remainder);
    }
}
