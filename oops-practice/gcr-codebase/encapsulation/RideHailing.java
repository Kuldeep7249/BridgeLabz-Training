interface GPS{
    void getCurrentLocation();
    void updateLocation(String newLocation);
}
abstract class Vehicle implements GPS {
    private String vehicleId;
    private String driverName;
    private int ratePerKm;

    public Vehicle(String vehicleId, String driverName, int ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public int getRatePerKm() {
        return ratePerKm;
    }
    public void getCurrentLocation() {
        System.out.println("Current location of vehicle " + vehicleId + " is being tracked.");
    }
    public void updateLocation(String newLocation) {
        System.out.println("Vehicle " + vehicleId + " location updated to: " + newLocation);
    }
    public abstract void displayVehicleInfo();
    public abstract void calculateFare(int distance);
}
class Car extends Vehicle {
    public Car(String vehicleId, String driverName, int ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public void displayVehicleInfo() {
        System.out.println("Car ID: " + getVehicleId() + ", Driver: " + getDriverName());
    }

    @Override
    public void calculateFare(int distance) {
        System.out.println("Car Fare for " + distance + " km: " + (distance * getRatePerKm()));
    }
}
class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, int ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public void displayVehicleInfo() {
        System.out.println("Bike ID: " + getVehicleId() + ", Driver: " + getDriverName());
    }

    @Override
    public void calculateFare(int distance) {
        System.out.println("Bike Fare for " + distance + " km: " + (distance * getRatePerKm()));
    }
}
class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, int ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public void displayVehicleInfo() {
        System.out.println("Auto ID: " + getVehicleId() + ", Driver: " + getDriverName());
    }

    @Override
    public void calculateFare(int distance) {
        System.out.println("Auto Fare for " + distance + " km: " + (distance * getRatePerKm()));
    }
}
public class RideHailing {
    public static void main(String[] args) {
        Vehicle car = new Car("C123", "Alice", 15);
        Vehicle bike = new Bike("B456", "Bob", 10);
        Vehicle auto = new Auto("A789", "Charlie", 12);

        car.displayVehicleInfo();
        car.calculateFare(10);
        car.getCurrentLocation();
        car.updateLocation("Downtown");
        bike.displayVehicleInfo();
        bike.calculateFare(10);
        bike.getCurrentLocation();
        bike.updateLocation("Uptown");
        auto.displayVehicleInfo();
        auto.calculateFare(10);
        auto.getCurrentLocation();
        auto.updateLocation("Midtown"); 
    }
}
