class Product {
    private static int productCount = 0;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        productCount++;
    }

    public static void displayProductCount() {
        System.out.println("Total Products Created: " + productCount);
    }

    public void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }
}

public class TrackObjectCount  {
    public static void main(String[] args) {
        Product product1 = new Product("Shreyas Laptop", 75000);
        Product product2 = new Product("Vallabh Tablet", 35000);
        Product product3 = new Product("Zeinth Phone", 50000);
        Product product4 = new Product("Prachi Monitor", 20000);
        Product product5 = new Product("Atharva Keyboard", 5000);

        System.out.println("Product Details:");
        product1.displayDetails();
        product2.displayDetails();
        product3.displayDetails();
        product4.displayDetails();
        product5.displayDetails();

        Product.displayProductCount();
    }
}


