/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package milestone.pkg2;

import java.util.Scanner;

 class Milestone2 {

    
    public static void main(String[] args) {
       
        // Headings
        System.out.println("Payroll System");
        
        // Scanner Class
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        // Username 
        System.out.println("Enter Username: ");
        String Username = scanner.nextLine();
        
      // Employee LogIn
        if (Username.equals("employee") && Username.equals("payroll_staff")) {
            
            System.out.println("Enter Password: ");
            String Password = scanner.nextLine();
      
      // LogIn
            if (Username.equals("employees") && Password.equals("12345")) {
                    System.out.println("Login Successful!");
                    System.out.println("Your Employee Number: ");
                    System.out.println("Employee Name: ");
                    System.out.println("Birthday: ");
            }
            else if (Username.equals("payroll_staff")) {
              } else {
                    System.out.println("Invalid username or password.");
             }
        }
        
      
  
         
    }
    }