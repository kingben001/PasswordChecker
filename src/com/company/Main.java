package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String correctPassword = "test123";
        System.out.println("Please enter your password.");
        String attempt1 = keyboard.nextLine();

        if (attempt1.equals(correctPassword)) {
            System.out.println("You have entered the correct password");
        }
       
        else  {
            System.out.println("Wrong password. 1 more attempt");

            System.out.println("Please enter your password.");


            String attempt2 = keyboard.nextLine();

        if (attempt2.equals(correctPassword)) {
            System.out.println("You have entered the correct password");
        } else {
            System.out.println("You have run out of chances, contact the help desk");

        }
        }
    }
}
