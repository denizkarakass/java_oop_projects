package basic_stock_tracking_app;

public class main {

    public static void main(String[] args) {

        productModel product1 = new productModel("Apple", "Fruit", "2020-01-01", "2020-01-02");
        stockControl stockControl = new stockControl();

        stockControl.StockQuantitiy();

        System.out.println(product1.category);
    }

}
