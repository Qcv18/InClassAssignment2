class Vehicle {
    String make;
    String fuel;
    String colour;

    Vehicle(String make, String fuel, String colour) {
        this.make = make;
        this.fuel = fuel;
        this.colour = colour;
    }

    void displayInfo() {
        System.out.println("Make: " + make + ", Fuel: " + fuel + ", Colour: " + colour);
    }
}
