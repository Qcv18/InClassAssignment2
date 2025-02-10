public class TestVehicles {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Gasoline", "Red");
        Truck truck = new Truck("Ford", "Diesel", "Blue", 8);
        Bus bus = new Bus("Mercedes", "Electric", "White");
        Motorcycle bike = new Motorcycle("Yamaha", "Gasoline", "Black", true);

        car.displayInfo();
        System.out.println();
        truck.displayInfo();
        System.out.println();
        bus.displayInfo();
        System.out.println();
        bike.displayInfo();
    }
}
