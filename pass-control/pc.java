package passControl;

import java.util.Scanner;

public class pc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Şifre giriniz: ");
        String psw = in.next();
        switch (psw) {
            case "7273":
                System.out.println("Hoşgeldin Ali");
                break;

            case "121212":
                System.out.println("Hoşgeldin Deniz");
                break;

            default:
                System.out.println("Şifre yanlış");
        }
    }
}
