import java.util.Scanner;

public class SimpleATM {
    // Start with some money in the account
    static double balance = 1000.0;

    // Show current balance
    public static void showBalance() {
        System.out.println("Your current balance is: ₹" + balance);
    }

    // Add money to the account
    public static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited ₹" + amount);
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    // Withdraw money from the account
    public static void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than 0.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! You only have ₹" + balance);
        } else {
            balance -= amount;
            System.out.println("You have withdrawn ₹" + amount + ". Please collect your cash.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the ATM");

        // Keep showing menu until user exits
        do {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                showBalance();
            }
            else if (choice == 2) {
                System.out.print("Enter amount to deposit: ₹");
                double depositAmount = sc.nextDouble();
                deposit(depositAmount);
            }
            else if (choice == 3) {
                System.out.print("Enter amount to withdraw: ₹");
                double withdrawAmount = sc.nextDouble();
                withdraw(withdrawAmount);
            }
            else if (choice == 4) {
                System.out.println("Thank you for using the ATM. Goodbye!");
            }
            else {
                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
