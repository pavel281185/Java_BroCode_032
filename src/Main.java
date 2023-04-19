public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car1 = new Car("BMW");
        garage.park(car1);
        Car car2 = new Car("Tesla");
        garage.park(car2);
    }
}