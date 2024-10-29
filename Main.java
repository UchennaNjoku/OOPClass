import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize Inventory
        Inventory inventory = new Inventory();

        // Initialize Catalog
        Catalog catalog = new Catalog(inventory);

        // Display the products
        catalog.displayProducts();

        // Create a Customer
        Customer customer = new Customer("C001", "John Doe", true, 0);

        // Create a Transaction
        Transaction transaction = new Transaction(customer);

        // Simulate adding items to the transaction
        Product espresso = inventory.getProductById("001");
        Product latte = inventory.getProductById("002");
        Product muffin = inventory.getProductById("005");

        // Add items to the transaction
        transaction.addItem(espresso, 2); // Add 2 Espressos
        transaction.addItem(latte, 1);    // Add 1 Latte
        transaction.addItem(muffin, 3);   // Add 3 Muffins

        // Remove an item from the transaction
        transaction.removeItem(muffin, 1); // Remove 1 Muffin

        // Finalize the transaction
        transaction.finalizeTransaction();

        // Print the receipt
        transaction.printReceipt();

        // Display updated inventory
        catalog.displayProducts();

        // Display customer's loyalty points
        System.out.println("Customer's Loyalty Points: " + customer.getLoyaltyPoints());
    }
}
