package FunctionalInterface.DigitalPayment;

public class Main {
	public static void main(String[] args) {

        Payment p1 = new UPI();
        Payment p2 = new CreditCard();
        Payment p3 = new Wallet();

        p1.pay();
        p2.pay();
        p3.pay();
    }

}
