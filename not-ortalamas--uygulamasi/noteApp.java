import java.util.Scanner;

/*
 * Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını 
kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, 
eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

 */

 import java.util.*;

public class noteApp {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        int mat = input.nextInt();

        System.out.print("Fizik Notunuz:");
        int fizik = input.nextInt();

        System.out.print("Kimya Notunuz:");
        int kimya = input.nextInt();

        System.out.print("Türkçe Notunuz:");
        int tr = input.nextInt();

        System.out.print("Tarih Notunuz:");
        int tar = input.nextInt();

        System.out.print("Müzik Notunuz:");
        int muz = input.nextInt();

        double ort = (mat + fizik + kimya + tr + tar + muz ) / 6 ;
        System.out.println("Ortalamanız = " + ort);

       if(ort >= 60){
        System.out.println("Sınıfı geçtiniz.");
       }else{
        System.out.println("Kaldınız.");
       }
    }
}
