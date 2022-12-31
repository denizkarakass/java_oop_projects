/*
 * Name: Deniz
 * Surname: Karakaş
 * Student ID: 210316025
 */

package lab3;

import java.util.*;

public class lab3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US); // https://www.tutorialspoint.com/java/util/scanner_nextdouble.htm

        System.out.print("You can chose Q1 or Q2. If you chose Q1 or Q2, you can write Q1 or Q2:  ");
        String cho = in.next();

        if (cho.equals("Q1")) {
            // Q1
            try {
                System.out.print("Enter your weight in pounds: ");
                double pounds = in.nextDouble();
                System.out.print("Enter your heiht in inches: ");
                double inch = in.nextDouble();
                double kilograms = pounds * 0.45359237;
                double meters = inch * 0.0254;
                double bmi = kilograms / Math.pow(meters, 2);
                System.out.println("Your BMI is: " + bmi);

                if (bmi < 18.5) {
                    System.out.println("Underweight");
                } else if (bmi < 25.0) {
                    System.out.println("Normal");
                } else if (bmi < 30.0) {
                    System.out.println("Overweight");
                } else if (bmi > 30.0) {
                    System.out.println("Obese");
                } else {
                    System.out.println("We have a problem about calculate.");
                }
            } finally {
                in.close();
            }

        }

        else if (cho.equals("Q2")) {
            // Q2
            System.out.print("Enter 1. number: ");
            double num1 = in.nextDouble();
            System.out.print(
                    "1:for addition \n2:for substraction \n3:for multiplying \n4.for dividing \n Chose operation: ");
            short operat = in.nextShort();
            System.out.print("Enter 2. number: ");
            double num2 = in.nextDouble();

            if (operat == 1) {
                System.out.println(num1 + num2);
            } else if (operat == 2) {
                System.out.println(num1 - num2);
            } else if (operat == 3) {
                System.out.println(num1 * num2);
            } else if (operat == 4) {
                System.out.println(num1 / num2);
            } else {
                System.out.println("You need to chose 1,2,3 or 4.");
            }

        } else
            System.out.println("You need to choose Q1 or Q2 .");

    }
}
