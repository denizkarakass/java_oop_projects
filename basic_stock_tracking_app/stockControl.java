import java.util.Scanner;

public class stockControl {

    public int quantity;

    public stockControl() {
        this.quantity = quantity;
    }

    public static int StockQuantitiy(int quantity) {
        return quantity;
    }

    // Kişiden ürün stok miktarını aldım
    public static void StockQuantitiy(String[] args) {
        System.out.print("Please enter stock quantity for product: ");
        Scanner stockQuantitity = new Scanner(System.in);
        quantity = StockQuantitiy(stockQuantitity);
    }

}
