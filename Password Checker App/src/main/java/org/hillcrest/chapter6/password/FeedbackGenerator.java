package org.hillcrest.chapter6.password;

public class FeedbackGenerator {
    //utility class for generating feedback based on password

    /**
     * Gives notes on how to improve password
     * @param password password inputted
     * @return Notes on how to improve
     */
    public static String generateFeedback(String password) {
        String improve = "";
        if (password.length()<=7) {
            improve += "\nIncrease length to at least 8 characters";;
        }
        String lower = "abcdefghijklmnopqrstuvwxyz";

        int index = 0;
        char lowChar;
        while (true) {
            lowChar = lower.charAt(index);
            if (password.contains(String.valueOf(lowChar))){
                break;
            }
            index ++;
            if (index == 26) {
                improve += "\nAdd at least one lowercase letter.";
                break;
            }
        }
        String upper = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
        index = 0;
        char upChar;
        while (true) {
            upChar = upper.charAt(index);
            if (password.contains(String.valueOf(upChar))){
                break;
            }
            index ++;
            if (index == 26) {
                improve += "\nAdd at least one uppercase letter.";
                break;
            }
        }

        String num = "1234567890";
        index = 0;
        char numChar;
        while (true) {
            numChar = num.charAt(index);
            if (password.contains(String.valueOf(numChar))){
                break;
            }
            index ++;
            if (index == 10) {
                improve += "\nAdd at least one number";
                break;
            }
        }
        String spe = "!@#$%^&*()-+=";
        index = 0;
        char speChar;
        while (true) {
            speChar = spe.charAt(index);
            if (password.contains(String.valueOf(speChar))){
                break;
            }
            index ++;
            if (index == 13) {
                improve += "\nAdd at least one special character.";
                break;
            }
        }
        return improve;
    }
}
