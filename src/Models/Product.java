package Models;

public class Product {
    String product_name;
    String product_code;
    String product_price;
    String product_brand;
    String product_description;

    public Product(String product_name, String product_code, String product_price, String product_brand, String product_description) {
        this.product_name = product_name;
        this.product_code = product_code;
        this.product_price = product_price;
        this.product_brand = product_brand;
        this.product_description = product_description;
    }
}

