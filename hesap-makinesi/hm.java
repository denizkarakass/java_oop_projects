package hesap_makinesi;

import java.util.Scanner;

public class hm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double x = input.nextDouble();
        System.out.print("Enter operate (+,-,*,/): ");
        String operate = input.next();
        System.out.print("Enter Second number: ");
        double y = input.nextDouble();

        switch (operate) {

            case "+":
                System.out.println(x + y);
                break;

            case "-":
                System.out.println(x - y);
                break;

            case "*":
                System.out.println(x * y);
                break;

            case "/":
                System.out.println(x / y);
                break;

        }

    }
}
