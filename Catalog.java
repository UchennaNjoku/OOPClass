import java.util.Map;

public class Catalog {
    private Inventory inventory;

    public Catalog(Inventory inventory) {
        this.inventory = inventory;
    }

    // display all products in the inventory
    public void displayProducts() {
        Map<String, Product> products = inventory.getAllProducts();
        
        System.out.println("\n╔═══════════════════ WildBucks Menu ═══════════════════╗");
        System.out.println("║ ID  │ Name                │ Price     │ Stock      ║");
        System.out.println("╠═════╪═══════════════════════╪═══════════╪═══════════╣");

        for (Product product : products.values()) {
            System.out.printf("║ %-3s │ %-20s │ $%-8.2f │ %-10d ║\n",
                product.getProductId(),
                truncate(product.getName(), 20),
                product.getPrice(),
                product.getStockQuantity()
            );
        }

        System.out.println("╚═════════════════════════════════════════════════════╝");
    }

    // handle if a product name is too long for the space so it still looks good
    private String truncate(String str, int length) {
        return str.length() > length ? str.substring(0, length - 3) + "..." : str;
    }
}