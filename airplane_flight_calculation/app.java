package fly_calculate;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter KM:");
        double km = in.nextDouble();
        System.out.print("Enter Age:");
        int age = in.nextInt();
        System.out.print("Enter Section (1 or 2):");
        int type = in.nextInt();
        System.out.print("You can choose 1 for one way or can choose 2 for double direction:");
        int direct = in.nextInt();

        double price = km / 10;

        if (type == 1 || type == 2) {
            if (direct == 2) {
                double dPrice = price - price * 2 / 10;
                if (age < 12) {
                    double rPrice = dPrice / 2;
                    System.out.println("Price is " + rPrice * 2);
                } else if (age < 24) {
                    double rPrice = dPrice - dPrice * 1 / 10;
                    System.out.println("Price is " + rPrice * 2);
                } else if (age > 65) {
                    double rPrice = dPrice - dPrice * 3 / 10;
                    System.out.println("Price is " + rPrice * 2);
                } else {
                    System.out.println("Price is " + dPrice);
                }
            } else if (direct == 1) {
                if (age < 12) {
                    double rPrice = price / 2;
                    System.out.println("Price is " + rPrice);
                } else if (age < 24) {
                    double rPrice = price - price / 10;
                    System.out.println("Price is " + rPrice);
                } else if (age > 65) {
                    double rPrice = price - price * 3 / 10;
                    System.out.println("Price is " + rPrice);
                } else {
                    System.out.println("Price is " + price);
                }
            } else {
                System.out.println("You need to choose double or one .");
            }

        } else {
            System.out.println("İnput Data Error");
        }

    }
}
