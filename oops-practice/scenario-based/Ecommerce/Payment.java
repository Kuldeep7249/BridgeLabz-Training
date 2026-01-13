package Ecommerce;

public interface Payment {
    void pay(double amount) throws PaymentFailedException;
}
