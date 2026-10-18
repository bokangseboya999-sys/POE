/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

/**
 *
 * @author Bokang Seboya
 */

import java.util.ArrayList;
import java.util.Scanner;

public class QuickChat {

    private ArrayList<Message> messages = new ArrayList<>();

    public void startChat(Scanner input) {

        System.out.println("Welcome to QuickChat.");

        System.out.print("How many messages would you like to enter? ");
        int numberOfMessages = input.nextInt();
        input.nextLine();

        int messagesSent = 0;

        while (true) {

            System.out.println("\n=== QUICKCHAT MENU ===");
            System.out.println("1. Send Messages");
            System.out.println("2. Show recently sent messages");
            System.out.println("3. Quit");
            System.out.print("Choose an option: ");

            int option = input.nextInt();
            input.nextLine();

            if (option == 1) {

                if (messagesSent >= numberOfMessages) {
                    System.out.println(
                            "You have reached your message limit.");
                    continue;
                }

                System.out.print("Enter recipient number (+27...): ");
                String recipient = input.nextLine();

                System.out.print("Enter your message: ");
                String messageText = input.nextLine();

                Message message = new Message(
                        recipient, messageText, messagesSent + 1);

                if (!message.checkRecipient()) {
                    System.out.println(
                            "Cell phone number is incorrectly formatted "
                            + "or does not contain an international code.");
                } else if (!message.checkMessageLength()) {
                    System.out.println(
                            "Please enter a message of less than 250 characters.");
                } else {

                    messages.add(message);
                    messagesSent++;

                    System.out.println("Message sent");
                    System.out.println(
                            "Message ID: " + message.getMessageID());
                    System.out.println(
                            "Message number: "
                            + message.getMessageNumber());
                }

            } else if (option == 2) {

                System.out.println("Coming Soon.");

            } else if (option == 3) {

                System.out.println("Thank you for using QuickChat.");
                break;

            } else {

                System.out.println(
                        "Invalid option. Please choose 1, 2 or 3.");
            }
        }
    }
}

