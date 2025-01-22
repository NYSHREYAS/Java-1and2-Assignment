class Shape {
    private String shapeType;
    private double radius;
    private double length;
    private double breadth;

    public Shape() {
        this.shapeType = "Circle";
        this.radius = 1.0;
    }

    public Shape(double length, double breadth) {
        this.shapeType = "Rectangle";
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        if (shapeType.equals("Circle")) {
            return Math.PI * radius * radius;
        } else if (shapeType.equals("Rectangle")) {
            return length * breadth;
        } else {
            return 0;
        }
    }

    public void displayDetails(String name) {
        System.out.println("Name: " + name);
        System.out.println("Shape Type: " + shapeType);
        if (shapeType.equals("Circle")) {
            System.out.println("Radius: " + radius);
        } else if (shapeType.equals("Rectangle")) {
            System.out.println("Length: " + length);
            System.out.println("Breadth: " + breadth);
        }
        System.out.println("Area: " + calculateArea());
        System.out.println("--------------------------");
    }
}

public class ConstructorOverloadingforShapes {
    public static void main(String[] args) {
        Shape shreyasCircle = new Shape();
        Shape vallabhRectangle = new Shape(4.0, 5.0);
        Shape zeinthRectangle = new Shape(6.5, 3.2);
        Shape prachiCircle = new Shape();
        Shape atharvaRectangle = new Shape(7.0, 8.5);

        System.out.println("Shape Details:");
        shreyasCircle.displayDetails("Shreyas");
        vallabhRectangle.displayDetails("Vallabh");
        zeinthRectangle.displayDetails("Zeinth");
        prachiCircle.displayDetails("Prachi");
        atharvaRectangle.displayDetails("Atharva");
    }
}



