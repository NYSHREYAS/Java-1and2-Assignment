class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "Unknown";
        author = "Anonymous";
        price = 0.0;
    }

    void displayDetails() {
        System.out.println("\nBook Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }
}

public class DefaultConstructorforBookDetails {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();
        Book b4 = new Book();
        Book b5 = new Book();

        b1.title = "Java Programming";
        b1.author = "Shreyas";
        b1.price = 599.99;

        b2.title = "Python Basics";
        b2.author = "Vallabh";
        b2.price = 499.99;

        b3.title = "Web Development";
        b3.author = "Zeinth";
        b3.price = 699.99;

        b4.title = "Data Science";
        b4.author = "Prachi";
        b4.price = 799.99;

        b5.title = "AI Fundamentals";
        b5.author = "Atharva";
        b5.price = 899.99;

        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
        b4.displayDetails();
        b5.displayDetails();
    }
}

