import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JFrame;

public class database1 extends JFrame {

    LoginPage type1;
    // A map to store usernames and passwords
    private static HashMap<String, String> users = new HashMap<>();

    public static void main(String[] args) {
        // Pre-populating some users for demonstration purposes
        users.put("poonam", "1234");
        users.put("Sudeep", "4321");
        users.put("user3", "password3");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (authenticate(username, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Invalid username or password.");
        }

        scanner.close();
    }

    // Method to authenticate the user
    private static boolean authenticate(String username, String password) {
        // Check if the username exists in the map and if the password matches
        return users.containsKey(username) && users.get(username).equals(password);
    }
}