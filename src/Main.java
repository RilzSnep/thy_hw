import models.UserCredentials;
import exceptions.ValidationException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter login: ");
        String login = scanner.nextLine();

        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        System.out.println("Confirm password: ");
        String confirmPassword = scanner.nextLine();

        try {
            UserCredentials.validate(login, password, confirmPassword);
            UserCredentials user = new UserCredentials(login, password);
            System.out.println("User credentials are valid.");
        } catch (ValidationException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
    }
}
