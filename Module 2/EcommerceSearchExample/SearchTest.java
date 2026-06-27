// Main class
public class SearchTest {

    public static void main(String[] args) {

        // Sorted array for Binary Search
        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Shoes", "Footwear"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Bag", "Fashion")

        };

        int searchId = 104;

        // Linear Search
        System.out.println("Linear Search:");

        Product result1 = SearchAlgorithms.linearSearch(products, searchId);

        if (result1 != null)
            result1.display();
        else
            System.out.println("Product not found");

        System.out.println();

        // Binary Search
        System.out.println("Binary Search:");

        Product result2 = SearchAlgorithms.binarySearch(products, searchId);

        if (result2 != null)
            result2.display();
        else
            System.out.println("Product not found");
    }

}