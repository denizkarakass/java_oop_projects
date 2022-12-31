import java.util.Scanner;

public class artik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Yil Giriniz: ");
        int yil = in.nextInt();
        System.out.println();

        if (yil % 4 == 0) {
            if (yil % 100 == 0 && yil % 400 != 0) {
                System.out.println(yil + " bir artik yil degildir.");
            } else {
                System.out.println(yil + " bir artik yildir.");
            }
        } else {
            System.out.println(yil + " bir artik yil degildir.");
        }
    }
}
