// Product class representing an item in the e-commerce platform
public class Product {

    // Product attributes
    int productId;
    String productName;
    String category;

    // Constructor
    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    // Display product details
    public void display() {
        System.out.println(productId + "  " + productName + "  " + category);
    }
}