import java.util.Scanner;

public class ComplexCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");
        System.out.println("6. Modulus");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        double result = 0; 

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                } else {
                    result = num1 / num2;
                }
                break;
            case 5:
                result = Math.pow(num1, num2);
                break;
            case 6:
                if (num2 == 0) {
                    System.out.println("Error: Cannot calculate modulus with divisor 0.");
                } else {
                    result = num1 % num2;
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

        if (choice >= 1 && choice <= 6 && num2 != 0) {
            System.out.println("Result: " + result);
        }
    }
}