package FunctionalInterface.DigitalPayment;

public class Wallet implements Payment {

    public void pay() {
        System.out.println("Payment done using Wallet");
    }
}
