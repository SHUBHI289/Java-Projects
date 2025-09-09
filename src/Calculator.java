import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("    Welcome to My Calculator   ");
        System.out.println("=================================");
        System.out.println("You can perform: +, -, *, /");
        System.out.println();

        // Input from user
        System.out.print(" Please enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print(" choose an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print(" enter the second number: ");
        double num2 = sc.nextDouble();

        double result;

        System.out.println("\n Calculating...\n");

        // Switch-case for operations
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(" The sum of " + num1 + " and " + num2 + " is: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("The difference between " + num1 + " and " + num2 + " is: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(" The product of " + num1 + " and " + num2 + " is: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(" The division of " + num1 + " by " + num2 + " is: " + result);
                } else {
                    System.out.println(" Error: You can’t divide by zero!");
                }
                break;

            default:
                System.out.println(" Oops! That’s not a valid operator.");
        }

        System.out.println("\n Thanks for using this calculator!");
        System.out.println("=================================");

        sc.close();
    }
}

