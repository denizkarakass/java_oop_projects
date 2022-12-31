/*
 * Name - Surname: Deniz - Karakaş
 * Student ID: 210316025
 */
package account;

import java.util.Scanner; // I have imported the Scanner.

public class HW210316025 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // I created a new Scanner.
        System.out.print("Enter an account number: "); // I printed the value I wanted from the user as a string.
        String account = in.nextLine(); // I got the value of the Account variable from the user.
        String capitalLet = account.substring(0, 2); // Getting the first 2 indexes of the entered value.
        int cValue1 = Integer.valueOf(account.charAt(0)); // I got the 0th index of the entered value
        int cValue2 = Integer.valueOf(account.charAt(1)); // I got the 1th index of the entered value
        /*
         * The entered value is 16 digits, the first 2 digits are uppercase and the
         * first digit is lower than the second digit.
         */
        if (account.length() == 16 && capitalLet.equals(capitalLet.toUpperCase()) && cValue1 < cValue2) {
            int fNum1 = Integer.parseInt(account.substring(2, 3)); // I got the 2th index of the entered value
            int fNum2 = Integer.parseInt(account.substring(3, 4)); // I got the 3th index of the entered value

            /*
             * I set the prime variable to true if the loops return false, the 3rd and 4th
             * digits entered are not prime.
             */
            boolean prime = true;
            for (int i = 2; i < fNum1; i++) {
                if (fNum1 % i == 0) {
                    prime = false;
                }
            }

            if (prime) { // If the 3rd is prime, it will enter to check the 4th digit.
                for (int i = 2; i < fNum2; i++) {
                    if (fNum2 % i == 0) {
                        prime = false;
                    }
                }

                if (prime) { // If the 4th is prime, it will go into the if block.
                    int singleDigitAll = 0, otherDigitAll = 0;
                    for (int k = 4; k <= 15; k = k + 2) { // It returns single digit numbers.
                        int fNumLast = Integer.parseInt(account.substring(k, k + 1)); // Convert expression to integer.
                        fNumLast = fNumLast * 2; // I multiplied the integer expression by 2.
                        if (fNumLast > 9) { // If it is two digits, fNUmLast enters this block.
                            /*
                             * I first converted the expression to a string and split it into digits, then
                             * converted it back to an integer and summed it up.
                             */
                            String fNumLastDigits = String.valueOf(fNumLast);
                            int fNumLastDigit1 = Integer.parseInt(fNumLastDigits.substring(0, 1));
                            int fNumLastDigit2 = Integer.parseInt(fNumLastDigits.substring(1, 2));
                            fNumLast = fNumLastDigit1 + fNumLastDigit2;
                        }
                        singleDigitAll += fNumLast; // I've gathered all the single-digit numbers in one place.
                    }

                    for (int z = 15; z >= 5; z = z - 2) { // It returns other digit numbers.
                        int fNumLast2 = Integer.parseInt(account.substring(z, z + 1)); // Convert expression to integer.
                        otherDigitAll += fNumLast2; // I've gathered all the other-digit numbers in one place.
                    }

                    int result = otherDigitAll + singleDigitAll; // I've gathered all the single and otherdigit numbers.
                    if (result % 10 == 0) { // I printed valid if the result is divisible by 10.
                        System.out.println("The account number " + account + " is a valid.");
                    } else { // I printed valid if the result is not divisible by 10.
                        System.out.println("NOT VALID | The account number " + account + " is not a valid.");
                    }
                }
            }

        } else {
            /*
             * It works if the first two letters are lowercase or not 16 digits, or if the
             * first letter is greater than the second letter.
             */
            System.out.println("NOT VALID | The account number " + account + " is not a valid.");
        }
    }

}

// Test valid: AC11576018412626 | COMPLETED TEST PROCESS