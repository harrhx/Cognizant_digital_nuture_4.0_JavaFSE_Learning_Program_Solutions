import java.util.HashMap;
import java.util.Map;


public class Inventory {
    private Map<String, Product> products;

    public Inventory() {
        this.products = new HashMap<>();
    }

    public void addProduct(Product product) {
        if (product != null && product.getProductId() != null) {
            products.put(product.getProductId(), product);
            System.out.println("Added: " + product.getProductName());
        }
    }

    public void updateProduct(String productId, int newQuantity, double newPrice) {
        Product product = products.get(productId);
        if (product != null) {
            product.setQuantity(newQuantity);
            product.setPrice(newPrice);
            System.out.println("Updated Product: " + productId);
        } else {
            System.out.println("Update failed. Product with ID " + productId + " not found.");
        }
    }

    public void deleteProduct(String productId) {
        if (products.containsKey(productId)) {
            Product removedProduct = products.remove(productId);
            System.out.println("Deleted Product: " + removedProduct.getProductName());
        } else {
            System.out.println("Delete failed. Product with ID " + productId + " not found.");
        }
    }

    public Product getProduct(String productId) {
        return products.get(productId);
    }

    public void displayInventory() {
        System.out.println("\n--- Current Inventory ---");
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product product : products.values()) {
                System.out.println(product);
            }
        }
        System.out.println("-------------------------");
    }
}
