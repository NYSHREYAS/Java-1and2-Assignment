public class UsingthistoResolveConflicts {
    private String brand;
    private String model;
    private double price;

    public UsingthistoResolveConflicts(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        UsingthistoResolveConflicts car1 = new UsingthistoResolveConflicts("Toyota", "Camry", 30000.00);
        UsingthistoResolveConflicts car2 = new UsingthistoResolveConflicts("Honda", "Civic", 25000.00);

        System.out.println("Car 1 details:");
        car1.displayDetails();

        System.out.println("\nCar 2 details:");
        car2.displayDetails();
    }
}


