package basic_stock_tracking_app;

public class productModel {
    public String name;
    public String category;
    public String productionDate;
    public String sellDate;

    public productModel(String name, String category, String productionDate, String sellDate) {
        this.name = name;
        this.category = category;
        this.productionDate = productionDate;
        this.sellDate = sellDate;
    }

}
