package Models;

public class Order {
    String product_code;
    String user_id;
    String price;
    String quantity;

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Order(String product_code, String user_id, String price, String quantity) {
        this.product_code = product_code;
        this.user_id = user_id;
        this.price = price;
        this.quantity = quantity;

    }
}
