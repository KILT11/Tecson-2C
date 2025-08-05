/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
import bank.BankApp;
/**
 *
 * @author Lenovo
 */
public class AccountApp {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today?");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                BankApp bc = new BankApp();
                int trials = 0;
                boolean success = false;

                while (trials < 3 && !success) {
                    System.out.print("Enter your Account No: ");
                    int accountNo = sc.nextInt();

                    System.out.print("Enter your Pin: ");
                    int pin = sc.nextInt();

                    if (bc.verifyAccount(accountNo, pin)) {
                        
                        System.out.println("LOGIN SUCCESS");
                        success = true;
                    } else {
                        trials++;
                        System.out.println("INVALID ACCOUNT!");
                        if (trials < 3) {
                            System.out.println("Invalid Account No. or Password, Try AGAIN!. Attempts left: " + (3 - trials));
                        }
                    }
                }

                if (!success) {
                    System.out.println("Too many failed attempts. Program will now exit.");
                    System.exit(0);
                }
                break;

            case 2:
                System.out.println("Welcome to the Doctors Appointment system.");
                
                break;

            case 3:
                System.out.println("Welcome to the Shopping system.");
                
                break;

            default:
                System.out.println("Invalid Selection!");
        }
    }
    
}
