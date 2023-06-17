import java.util.Scanner;

public class Calc {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("***** Calc Application *****\n");
        displayMenu();

        try {
            takeInput();
        } catch (Exception e) {
            System.err.println("There was an error: " + e.getMessage());
            sc.nextLine();
            takeInput();
        }

    }

    private static void displayMenu() {
        System.out.println("""
                1. Addition
                2. Subtraction
                3. Multiplication
                4. Division
                5. Exit
                """);
    }

    private static void takeInput() {
        int option;
        do {
            System.out.print("Choose an option: ");
            option = sc.nextInt();

            if (option > 0 && option < 6) {
                System.out.print("Enter the first number: ");
                int a = sc.nextInt();
                System.out.print("Now, enter the second number: ");
                int b = sc.nextInt();
                performOperation(option, a, b);
            }
        } while (option != 5);
        System.out.println("Goodbye!");
    }

    private static void performOperation(int option, int a, int b) {
        switch (option) {
            case 1:
                System.out.println("Result: " + sum(a, b));
                break;
            case 2:
                System.out.println("Result: " + subtract(a, b));
                break;
            case 3:
                System.out.println("Result: " + multiply(a, b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Result: " + divide(a, b));
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Wrong option, please try again.");
        }
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static double divide(double a, double b) {
        return a / b;
    }
}
