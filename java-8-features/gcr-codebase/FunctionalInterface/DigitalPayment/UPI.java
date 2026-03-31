package FunctionalInterface.DigitalPayment;

public class UPI implements Payment {

    public void pay() {
        System.out.println("Payment done using UPI");
    }
}
