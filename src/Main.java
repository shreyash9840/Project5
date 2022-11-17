import Models.Order;
import Models.Product;
import Models.Users;

public class Main {
    public static void main(String[] args) {
        Users user1 = new Users("Shreyash","9840394346");
        Product product1 = new Product("T-shirt","123as","2500","Adidas","Best");
        Order order1 = new Order("123as","14","250","250");
    }
}
