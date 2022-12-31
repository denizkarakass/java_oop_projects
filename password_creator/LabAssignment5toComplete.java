package lab5;

import java.util.Scanner;

public class LabAssignment5toComplete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation;
        do {
            System.out.println("which operation do you want to do?");
            System.out.println("1- Write all even numbers between an interval");
            System.out.println("2- Generate and printout a random matrice");
            System.out.println("3- Generate a password and printout");
            System.out.println("0- for exit");
            operation = sc.nextInt();
            selectOperation(operation);
            System.out.println();
        } while (operation != 0);
        System.out.println("bye bye");

    }

    public static void selectOperation(int n) {
        Scanner sc = new Scanner(System.in);
        switch (n) {
            case 1: {
                System.out.println("write two integers as boundaries");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int big, small, ciftSmall;
                if (a > b) {
                    big = a;
                    small = b;
                } else {
                    big = b;
                    small = a;
                }
                if (small % 2 != 0) {
                    ciftSmall = small + 1;
                } else {
                    ciftSmall = small;
                }
                System.out.print("Integers: ");
                for (int i = ciftSmall; i < big; i = i + 2) {
                    System.out.print(i + ",");
                }
                break;
            }
            case 2: {
                System.out.println("write two integers as matrice size");
                int a = sc.nextInt(); // sütün
                int b = sc.nextInt(); // satır
                for (int x = 0; x < a; x++) {
                    for (int y = 0; y < b; y++) {
                        int sayi = (int) (Math.random() * 10);
                        System.out.print(sayi + " ");
                    }
                    System.out.println();
                }

                break;
            }
            case 3: {
                System.out.println("how much lenght password should be");
                int a = sc.nextInt();
                String pass = "";
                for (int i = 0; i < a; i++) {
                    int b = ((int) (Math.random() * 60)) + 50;
                    char c = (char) b;
                    pass += c;
                }
                System.out.println("password: " + pass);
                break;
            }
            default:
                break;
        }
    }

}
