class Truck extends Vehicle {
    int bedSize;

    Truck(String make, String fuel, String colour, int bedSize) {
        super(make, fuel, colour);
        this.bedSize = bedSize;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Bed Size: " + bedSize);
    }
}
