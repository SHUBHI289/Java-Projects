import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleLoginSystem {
    public static void main(String[] args) {

        // Store some dummy users with passwords
        Map<String, String> users = new HashMap<>();
        users.put("shubhi", "1234");
        users.put("admin", "admin123");

        Scanner sc = new Scanner(System.in);

        // Ask for login details
        System.out.print("Username: ");
        String username = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        // Check if username exists
        if (users.containsKey(username)) {
            String correctPassword = users.get(username);

            // Check password
            if (password.equals(correctPassword)) {
                System.out.println("Login successful! Welcome " + username + ".");
            } else {
                System.out.println("Wrong password. Try again.");
            }
        } else {
            System.out.println("User not found. Please check your username.");
        }

        sc.close();
    }
}

