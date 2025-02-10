System.out.println("GitHub edit successful!");

public class TestVehicles {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022, 4);
        Truck truck = new Truck("Ford", 2020, 5000);

        car.displayInfo();
        System.out.println("Final test edit!");
        truck.displayInfo();
    }
}
