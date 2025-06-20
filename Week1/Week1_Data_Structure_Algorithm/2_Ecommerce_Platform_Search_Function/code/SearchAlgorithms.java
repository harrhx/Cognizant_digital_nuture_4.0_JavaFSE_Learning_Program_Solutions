import java.util.Arrays;


public class SearchAlgorithms {

    public static void main(String[] args) {
        Product[] products = {
            new Product(105, "Laptop", "Electronics"),
            new Product(101, "Mouse", "Electronics"),
            new Product(110, "Book", "Education"),
            new Product(103, "Keyboard", "Electronics"),
            new Product(108, "Desk Chair", "Furniture")
        };

        System.out.println("--- Linear Search ---");
        int targetIdLinear = 103;
        Product foundProductLinear = linearSearch(products, targetIdLinear);

        System.out.println("Searching for Product ID: " + targetIdLinear);
        if (foundProductLinear != null) {
            System.out.println("Found: " + foundProductLinear);
        } else {
            System.out.println("Product with ID " + targetIdLinear + " not found.");
        }

        System.out.println("\n--- Binary Search ---");
        Arrays.sort(products);
        System.out.println("Array sorted for binary search:");
        for(Product p : products) {
            System.out.println("  " + p);
        }

        int targetIdBinary = 108;
        Product foundProductBinary = binarySearch(products, targetIdBinary);

        System.out.println("\nSearching for Product ID: " + targetIdBinary);
        if (foundProductBinary != null) {
            System.out.println("Found: " + foundProductBinary);
        } else {
            System.out.println("Product with ID " + targetIdBinary + " not found.");
        }
    }

    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.getproductid() == targetId) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] sortedProducts, int targetId) {
        int left = 0;
        int right = sortedProducts.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Product midProduct = sortedProducts[mid];

            if (midProduct.getproductid() == targetId) {
                return midProduct;
            }
            if (midProduct.getproductid() < targetId) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return null;
    }
}