package ActivityTemp;

import java.util.Scanner;

public class at {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Sıcaklığı giriniz: ");
        int temp = in.nextInt();

        if (temp < 5)
            System.out.println("Kayak yap.");

        else if (temp < 15)
            System.out.print("Sinemeya git");

        else if (temp < 25)
            System.out.println("Pikniğe git.");

        else if (temp > 25)
            System.out.println("Yüzmeye git.");

        else
            System.out.println("Hava 25 derecedir.");
    }
}
