import UserAuth.LoginSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            LoginSystem loginSystem = new LoginSystem();

            loginSystem.addUser("Arta", "Samakova");

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (loginSystem.authenticate(username, password)) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid username or password.");
            }

            scanner.close();
        }
    }
