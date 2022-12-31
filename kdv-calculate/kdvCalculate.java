import java.util.Scanner;

public class kdvCalculate {
    public static void main(String[] args) {
        double price, kdv, total;
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter price:");
            price = in.nextDouble();
        }
        kdv = price * 18 / 100 ;
        total = kdv + price ;
        System.out.println("KDV is: " + kdv + "Total price is: " + total);
    }
}
