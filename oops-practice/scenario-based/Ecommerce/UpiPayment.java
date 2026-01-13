package Ecommerce;

public class UpiPayment implements Payment{
    public void pay(double amount) throws PaymentFailedException{
        System.out.print("Ecommerce.Payment Successfully done");
    }
}
