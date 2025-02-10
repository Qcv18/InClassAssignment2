class Car extends Vehicle {
    int doors;

    Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + doors);
    }
}
