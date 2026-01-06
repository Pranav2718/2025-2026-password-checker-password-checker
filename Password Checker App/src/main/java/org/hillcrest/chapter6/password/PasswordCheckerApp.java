package org.hillcrest.chapter6.password;

import java.util.Scanner;

public class PasswordCheckerApp {
    //main method goes here
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = in.nextLine();

        int score = CriteriaChecker.evaluateCriteria(password);
        System.out.println();
        System.out.println(CriteriaChecker.determineStrength(score));
        System.out.println("Suggestions to improve your password:");
        System.out.println(FeedbackGenerator.generateFeedback(password));
    }
    //prompt user for password
    //Check strength
    //Provide user feedback based on the strength
}
