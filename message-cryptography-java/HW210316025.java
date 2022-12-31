/*
 * Name - Surname: Deniz - Karakaş
 * Student ID: 210316025
 */

// NOTE: This program is valid for the 26 digits and spaces given in the assignment. Some Turkish characters do not work: (ex: i,ş)

package crytopgraphy;

import java.util.Scanner;// I have imported the Scanner.

public class HW210316025 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // I created a new Scanner.
        System.out.print("Enter message: "); // I printed the value I wanted from the user as a string.
        String message = in.nextLine(); // I got the value of the Message variable from the user.

        for (int i = 0; i < message.length(); i++) { // Looping by message length.
            String digit = message.substring(i, i + 1); // I shredded every index of the message.
            int numberMessage = 0;
            // I assigned a number for each letter to the variable numberMessage.
            if (digit.equals("a") || digit.equals("A")) {
                numberMessage += 0;
            } else if (digit.equals("b") || digit.equals("B")) {
                numberMessage += 1;
            } else if (digit.equals("c") || digit.equals("C")) {
                numberMessage += 2;
            } else if (digit.equals("d") || digit.equals("D")) {
                numberMessage += 3;
            } else if (digit.equals("e") || digit.equals("E")) {
                numberMessage += 4;
            } else if (digit.equals("f") || digit.equals("F")) {
                numberMessage += 5;
            } else if (digit.equals("g") || digit.equals("G")) {
                numberMessage += 6;
            } else if (digit.equals("h") || digit.equals("H")) {
                numberMessage += 7;
            } else if (digit.equals("ı") || digit.equals("I")) {
                numberMessage += 8;
            } else if (digit.equals("j") || digit.equals("J")) {
                numberMessage += 9;
            } else if (digit.equals("k") || digit.equals("K")) {
                numberMessage += 10;
            } else if (digit.equals("l") || digit.equals("L")) {
                numberMessage += 11;
            } else if (digit.equals("m") || digit.equals("M")) {
                numberMessage += 12;
            } else if (digit.equals("n") || digit.equals("N")) {
                numberMessage += 13;
            } else if (digit.equals("o") || digit.equals("O")) {
                numberMessage += 14;
            } else if (digit.equals("p") || digit.equals("P")) {
                numberMessage += 15;
            } else if (digit.equals("q") || digit.equals("Q")) {
                numberMessage += 16;
            } else if (digit.equals("r") || digit.equals("R")) {
                numberMessage += 17;
            } else if (digit.equals("s") || digit.equals("S")) {
                numberMessage += 18;
            } else if (digit.equals("t") || digit.equals("T")) {
                numberMessage += 19;
            } else if (digit.equals("u") || digit.equals("U")) {
                numberMessage += 20;
            } else if (digit.equals("v") || digit.equals("V")) {
                numberMessage += 21;
            } else if (digit.equals("w") || digit.equals("W")) {
                numberMessage += 22;
            } else if (digit.equals("x") || digit.equals("X")) {
                numberMessage += 23;
            } else if (digit.equals("y") || digit.equals("Y")) {
                numberMessage += 24;
            } else if (digit.equals("z") || digit.equals("Z")) {
                numberMessage += 25;
            } else {
                numberMessage = 26;
            }

            /*
             * I used the number 26 to create a space, I made a condition that if it takes
             * 26 above and provides the following value, make a space.
             */
            if (!(numberMessage == 26)) {
                numberMessage += 3;
                numberMessage %= 26;
            }

            // I printed the incoming numbers as letters or space.
            switch (numberMessage) {
                case 0:
                    System.out.print("A");
                    break;
                case 1:
                    System.out.print("B");
                    break;
                case 2:
                    System.out.print("C");
                    break;
                case 3:
                    System.out.print("D");
                    break;
                case 4:
                    System.out.print("E");
                    break;
                case 5:
                    System.out.print("F");
                    break;
                case 6:
                    System.out.print("G");
                    break;
                case 7:
                    System.out.print("H");
                    break;
                case 8:
                    System.out.print("I");
                    break;
                case 9:
                    System.out.print("J");
                    break;
                case 10:
                    System.out.print("K");
                    break;
                case 11:
                    System.out.print("L");
                    break;
                case 12:
                    System.out.print("M");
                    break;
                case 13:
                    System.out.print("N");
                    break;
                case 14:
                    System.out.print("O");
                    break;
                case 15:
                    System.out.print("P");
                    break;
                case 16:
                    System.out.print("Q");
                    break;
                case 17:
                    System.out.print("R");
                    break;
                case 18:
                    System.out.print("S");
                    break;
                case 19:
                    System.out.print("T");
                    break;
                case 20:
                    System.out.print("U");
                    break;
                case 21:
                    System.out.print("V");
                    break;
                case 22:
                    System.out.print("W");
                    break;
                case 23:
                    System.out.print("X");
                    break;
                case 24:
                    System.out.print("Y");
                    break;
                case 25:
                    System.out.print("Z");
                    break;
                case 26:
                    System.out.print(" ");
                    break;

            }

        }

    }

}

// test value: MEET YOU IN THE PARK | COMPLETED TEST PROCESS