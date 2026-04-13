package com.mycompany.chatapp;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        
        //Scanner allows users to enter their corect information

        Scanner input = new Scanner(System.in);
       
        
        System.out.println("=== Register ===");

        String username = "";
        String password = "";
        String phoneNumber = "";

        Login user; // declare only

        //  USERNAME
        // Check if the username is correct
        while (true) {
            System.out.print("Enter username: ");
            username = input.nextLine();

            user = new Login(username, "", "");

            if (user.checkUserName("ky_le")) {
                System.out.println("Username successfully captured.");
                break;
            } else {
                System.out.println("ERROR: Username must contain '_' and be atleast 5 characters long.");
            }
        }

        //  PASSWORD 
        // Verify whether the correct password was provided
        while (true) {
            System.out.print("Enter password: ");
            password = input.nextLine();

            user = new Login(username, password, "");

            if (user.checkPasswordComplexity("Ghhskle@8")) {
                System.out.println("Password successfully captured.");
                break;
            } else {
                System.out.println("ERROR: Password must be 8+ characters, include capital, number, special character.");
            }
        }

        // PHONE NUMBER
        // Check the phone number whether it is the correct registered one 
        while (true) {
            System.out.print("Enter phone (+27XXXXXXXXX): ");
            phoneNumber = input.nextLine();

            user = new Login(username, password, phoneNumber);

            if (user.checkCellPhoneNumber("+27691057256")) {
                System.out.println("Cell phone number successfully added.");
                break;
            } else {
                System.out.println("ERROR: Invalid phone format.");
            }
        }

        // Login feedback
        // Provide the correct feedback to the user depending the details actually provided
        user = new Login(username, password, phoneNumber);

        System.out.println("Registration successful!");

        //  LOGIN
        //Display all the required information needed to complete the process
        System.out.println("\n=== Login ===");

        while (true) {
            System.out.print("Enter username: ");
            String loginUsername = input.nextLine();

            System.out.print("Enter password: ");
            String loginPassword = input.nextLine();
            
            //Call loginUser to check if details match the stored details

            boolean success = user.loginUser(loginUsername, loginPassword);
            //Provide the correct feedback login message
            System.out.println(user.returnLoginStatus(success));

            if (success) {
                break;
            }
        }
    }
}