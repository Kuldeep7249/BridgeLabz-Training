package Ecommerce;

public class WalletPayment implements Payment {
    public void pay(double amount) throws PaymentFailedException {
        if (amount > 2000) {
            throw new PaymentFailedException("Insufficient wallet balance");
        }
        System.out.println("Wallet payment successful: ₹" + amount);
    }
}
