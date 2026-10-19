/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe;

/**
 *
 * @author Bokang Seboya
 */

import java.util.Random;

public class Message {

    private String messageID;
    private String recipient;
    private String messageText;
    private int messageNumber;

    public Message(String recipient, String messageText,
                   int messageNumber) {

        this.messageID = generateMessageID();
        this.recipient = recipient;
        this.messageText = messageText;
        this.messageNumber = messageNumber;
    }

    // Generate a ten-digit message ID
    private String generateMessageID() {
        Random random = new Random();

        long number = 1000000000L
                + (long) (random.nextDouble() * 9000000000L);

        return String.valueOf(number);
    }

    // Validate recipient cellphone number
    public boolean checkRecipient() {
        return recipient != null
                && recipient.matches("\\+27[6-8][0-9]{8}");
    }

    // Message must contain fewer than 250 characters
    public boolean checkMessageLength() {
        return messageText != null
                && messageText.length() < 280;
    }

    // Return the message tracking ID
    public String getMessageID() {
        return messageID;
    }

    // Return the recipient number
    public String getRecipient() {
        return recipient;
    }

    // Return the message text
    public String getMessageText() {
        return messageText;
    }

    // Return the message number
    public int getMessageNumber() {
        return messageNumber;
    }
}

