import java.util.HashMap;
import java.util.Map;


public class Inventory {
    // maps product ID to product
    private Map<String, Product> products;
    
    // Constructor
    public Inventory() {
        this.products = new HashMap<>();

        // initialize some products
        products.put("001", new Product("001", "Espresso", 3.00, 100));
        products.put("002", new Product("002", "Latte", 4.00, 100));
        products.put("003", new Product("003", "Cappuccino", 3.50, 100));
        products.put("004", new Product("004", "Banana", 1.50, 100));
        products.put("005", new Product("005", "Muffin", 2.50, 50));
        products.put("006", new Product("005", "Cookie", 1.50, 75));

    }
    // Method to add product
    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    // Method to get product by ID
    public Product getProductById(String productId) {
        return products.get(productId);
    }

    // Method to get all products
    public Map<String, Product> getAllProducts() {
        return products;
    }
}
