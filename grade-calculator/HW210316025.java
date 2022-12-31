/*
 * Name-Surname: Deniz Karakaş
 * ID: 210316025
 */

import java.util.Scanner;

public class HW210316025 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter True Midtern Question: ");
        int Mid = in.nextInt(); // Consists of 5 multiple-choice questions (20 pts each).
        int mid = 20 * Mid;
        // System.out.println(mid);

        System.out.print("Enter True Quiz Question: ");
        int Quiz = in.nextInt(); // Consists of 20 multiple-choice questions (5 pts each).
        int quiz = 5 * Quiz;
        // System.out.println(quiz);

        System.out.print("Enter Final Point: ");
        int fin = in.nextInt();
        // System.out.println(fin);

        int perf = (int) (Math.random() * 100) + 1;
        System.out.println("Performance point: " + perf);

        double not = (25 * mid + 15 * quiz + 50 * fin + 10 * perf) / 100;
        System.out.println(not);

        if (not >= 90) {
            System.out.println("A");
        } else if (not >= 80) {
            System.out.println("B");
        } else if (not >= 65) {
            System.out.println("C");
        } else if (not >= 50) {
            System.out.println("D");
        } else {
            System.out.println("F | Fail");
        }

        if (not >= 50) {
            System.out.println("Succesful");
        }

    }
}
