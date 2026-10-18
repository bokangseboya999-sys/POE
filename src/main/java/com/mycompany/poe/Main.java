
package com.mycompany.poe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // PART 1: REGISTRATION

        System.out.println("=== REGISTRATION ===");

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        System.out.print("Enter cellphone number (+27...): ");
        String cellPhone = input.nextLine();

        Login user = new Login(
                username, password, cellPhone,
                firstName, lastName);

        System.out.println(user.registerUser());

        // Only continue if registration is valid

        if (user.checkUserName()
                && user.checkPasswordComplexity()
                && user.checkCellPhoneNumber()) {

            // PART 1: LOGIN

            System.out.println("\n=== LOGIN ===");

            System.out.print("Enter username: ");
            String loginUsername = input.nextLine();

            System.out.print("Enter password: ");
            String loginPassword = input.nextLine();

            if (user.loginUser(
                    loginUsername, loginPassword)) {

                System.out.println(
                        user.returnLoginStatus(
                                loginUsername, loginPassword));

                // PART 2: START QUICKCHAT

                QuickChat chat = new QuickChat();

                chat.startChat(input);

            } else {

                System.out.println(
                        "Username or password incorrect, "
                        + "please try again.");
            }

        }

        input.close();
    }
}


