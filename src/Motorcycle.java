class Motorcycle extends Vehicle {
    boolean hasSidecar;

    Motorcycle(String make, String fuel, String colour, boolean hasSidecar) {
        super(make, fuel, colour);
        this.hasSidecar = hasSidecar;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + hasSidecar);
    }
}
