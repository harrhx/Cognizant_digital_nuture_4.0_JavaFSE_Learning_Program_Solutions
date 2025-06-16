import java.util.HashMap;
import java.util.Map;

public class ProductManagement {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        System.out.println("--- Adding Products ---");
        inventory.addProduct(new Product("P001", "Laptop", 10, 1200.50));
        inventory.addProduct(new Product("P002", "Mouse", 50, 25.00));
        inventory.addProduct(new Product("P003", "Keyboard", 30, 75.99));
        inventory.displayInventory();

        System.out.println("\n--- Updating Product P002 ---");
        inventory.updateProduct("P002", 45, 24.50);
        inventory.displayInventory();

        System.out.println("\n--- Trying to Update Non-Existent Product P004 ---");
        inventory.updateProduct("P004", 5, 100.00);

        System.out.println("\n--- Deleting Product P003 ---");
        inventory.deleteProduct("P003");
        inventory.displayInventory();

        System.out.println("\n--- Trying to Delete Non-Existent Product P005 ---");
        inventory.deleteProduct("P005");
    }
}

class Product {
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId + ", Name: " + productName +
                ", Quantity: " + quantity + ", Price: $" + String.format("%.2f", price);
    }
}

