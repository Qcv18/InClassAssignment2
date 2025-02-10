class Truck extends Vehicle {
    int loadCapacity;

    Truck(String brand, int year, int loadCapacity) {
        super(brand, year);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " kg");
    }
}
