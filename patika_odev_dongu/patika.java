import java.util.Scanner;

public class patika {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi = in.nextInt();

        System.out.println();
        for (int i = 0; i < sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.print(i + " , ");
            }
        }
    }
}
