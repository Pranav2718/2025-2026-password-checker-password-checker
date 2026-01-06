package org.hillcrest.chapter6.password;

public class CriteriaChecker {

    //utility class

    /**
     *  Evaluates the password and gives a score
     * @param password the password inputted
     * @return score of the password
     */
    public static int evaluateCriteria(String password) {
        int count = 0;
        if (password.length()>7) {
            count ++;
        }
        String lower = "abcdefghijklmnopqrstuvwxyz";

        int index = 0;
        char lowChar;
        while (true) {
            lowChar = lower.charAt(index);
            if (password.contains(String.valueOf(lowChar))){
                count ++;
                break;
            }
            index ++;
            if (index == 26) {
                break;
            }
        }
        String upper = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
        index = 0;
        char upChar;
        while (true) {
            upChar = upper.charAt(index);
            if (password.contains(String.valueOf(upChar))){
                count ++;
                break;
            }
            index ++;
            if (index == 26) {
                break;
            }
        }

        String num = "1234567890";
        index = 0;
        char numChar;
        while (true) {
            numChar = num.charAt(index);
            if (password.contains(String.valueOf(numChar))){
                count ++;
                break;
            }
            index ++;
            if (index == 10) {
                break;
            }
        }
        String spe = "!@#$%^&*()-+=";
        index = 0;
        char speChar;
        while (true) {
            speChar = spe.charAt(index);
            if (password.contains(String.valueOf(speChar))){
                count ++;
                break;
            }
            index ++;
            if (index == 13) {
                break;
            }
        }
        return count;
    }

    /**
     * Tells the strength of the password
     * @param score score from evaluation
     * @return string on strength
     */
    public static String determineStrength(int score) {
        if (score > 3) {
            return "Strong (" + score + "/5)";
        } else if (score > 2){
            return "Moderate (" + score + "/5)";
        } else {
            return "Weak (" + score + "/5)";
        }
    }
}
