package com.example.schoolmanagementproject.view;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
@RequiredArgsConstructor
public class View {

    private static final Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            this.loginScreen();
        }
    }

    /**
     * Initial screen where the user chooses whether he is a
     * student(choice A) or a teacher(choice B).
     * The user's choice is a parameter to registerOrLogIn
     * function.
     */
    public void loginScreen() {
        System.out.println("""
                *********************************
                Enter your choice:\s
                A| Student
                B| Teacher
                C| School administration
                """
        );

        char choice;
        // todo
//        try {
//            choice = scanner.next().charAt(0);
//            if(choice == 'A') this.registerOrLogIn(choice);
//            else if (choice == 'C') {this.schoolLogInAccount.logInSchoolAdministration();}
//            else if(choice == 'B') this.registerOrLogIn(choice);
//            else {
//                System.out.println("Non valid input.");
//                this.loginScreen();
//            }
//
//        } catch (Exception e) {
//            System.out.println("Please enter only valid options.");
//            scanner.nextLine();
//            this.loginScreen();
//        }
    }

}
