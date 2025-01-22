class Vehicle {
    public void move() {
        System.out.println("The vehicle is moving.");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("The car is driving on the road.");
    }
}

class Bike extends Vehicle {
    @Override
    public void move() {
        System.out.println("The bike is zooming on the highway.");
    }
}

public class VehicleInheritance {
    public static void main(String[] args) {
        Vehicle myVehicle;

        myVehicle = new Car();
        myVehicle.move(); // Calls Car's move() method

        myVehicle = new Bike();
        myVehicle.move(); // Calls Bike's move() method
    }
}

