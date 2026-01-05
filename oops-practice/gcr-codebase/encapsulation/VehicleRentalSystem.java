interface Insurable{
    int calculateInsurance();
    void getInsuranceDetails();
}
abstract class Vehicle implements Insurable {
    private String VehicleNumber;
    private String Type;
    private int rentalRate;
    public Vehicle(String vehicleNumber, String type, int rentalRate) {
        this.VehicleNumber = vehicleNumber;
        this.Type = type;
        this.rentalRate = rentalRate;
    }
    abstract void calculateRentalCost(int days);
}
class Car extends Vehicle {
    public Car(String vehicleNumber, int rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }
    @Override
    public void calculateRentalCost(int days) {
        System.out.println("Car Rental Cost for " + days + " days: " + (days * 50));
    }
   public int calculateInsurance() {
        return 500;
    }
    public void getInsuranceDetails() {
        System.out.println("Car Insurance Amount: " + calculateInsurance());
    }
}
class Bike extends Vehicle {
    public Bike(String vehicleNumber, int rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }
    @Override
    public void calculateRentalCost(int days) {
        System.out.println("Bike Rental Cost for " + days + " days: " + (days * 20));
    }
    public int calculateInsurance() {
        return 200;
    }
    public void getInsuranceDetails() {
        System.out.println("Bike Insurance Amount: " + calculateInsurance());
    }

}
class Truck extends Vehicle {
    public Truck(String vehicleNumber, int rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }
    @Override
    public void calculateRentalCost(int days) {
        System.out.println("Truck Rental Cost for " + days + " days: " + (days * 100));
    }
    public int calculateInsurance() {
        return 1000;
    }
    public void getInsuranceDetails() {
        System.out.println("Truck Insurance Amount: " + calculateInsurance());
    }
}
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle car = new Car("CAR123", 50);
        car.calculateRentalCost(5);
        car.getInsuranceDetails();

        Vehicle bike = new Bike("BIKE123", 20);
        bike.calculateRentalCost(3);
        bike.getInsuranceDetails();

        Vehicle truck = new Truck("TRUCK123", 100);
        truck.calculateRentalCost(7);
        truck.getInsuranceDetails();
    }
}
