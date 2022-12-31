package manav;

import java.util.Scanner;

public class kasa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Armut kilo: ");
        double armut = in.nextDouble();
        double armutPrice = armut * 2.14 ;

        System.out.print("Elma kilo: ");
        double apple = in.nextDouble();
        double elmaPrice = apple  * 3.67 ;

        System.out.print("Domates kilo: ");
        double domat = in.nextDouble();
        double domatPrice = domat * 1.11 ;

        System.out.print("Muz kilo: ");
        double muz = in.nextDouble();
        double muzPrice = muz * 0.95 ;

        System.out.print("patlican kilo: ");
        double pat = in.nextDouble();
        double patlicanPrice = pat * 5.0 ;

        double sonuc = armutPrice + elmaPrice + domatPrice + muzPrice + patlicanPrice ;

        System.out.println("Toplam:" + sonuc );
    }
}
