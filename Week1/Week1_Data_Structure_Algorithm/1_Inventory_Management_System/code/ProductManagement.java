class ProductMangement {
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