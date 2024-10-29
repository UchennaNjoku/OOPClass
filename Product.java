public class Product {
    private String productId;
    private String name;
    private double price;
    private int stockQuantity;

    public Product(String productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    /* GETTERS AND SETTERS */
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public boolean reduceStock(int quantity) {
        if (quantity <= 0) {
            System.out.println("Error: Quantity must be greater than 0");
            return false;
        } 
        else if (stockQuantity == 0) {
            System.out.printf("Error: Sorry, %s is out of stock", this.name);
            return false;
        } 
        else if (quantity > stockQuantity) {
            System.out.printf("Error: Not enough stock of %s", this.name);
            return false;
        }
        stockQuantity -= quantity;
        System.out.printf("Success: %d items of %s removed from stock\n", quantity, this.name);
        return true;
    }
    public void increaseStock(int quantity) {
        if (quantity <= 0) {
            System.out.println("Error: Quantity must be greater than 0");
        } else {
            stockQuantity += quantity;
            System.out.printf("Success: %d items of %s added to stock\n", quantity, this.name);
        }
    }
    
}
