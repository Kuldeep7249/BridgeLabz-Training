package Ecommerce;

public class Order {
    private Product product;
    private int orderId;
    private Customer customer;
    private String status;

    public Order(int orderId, Product product, Customer customer) {
        this.orderId = orderId;
        this.product = product;
        this.customer = customer;
        this.status = "PLACED";
    }
    public void makePayment(Payment payment) {
        try {
            payment.pay(product.getPrize());
            status = "PAID";
        } catch (PaymentFailedException e) {
            status = "PAYMENT FAILED";
            System.out.println("Ecommerce.Payment Error: " + e.getMessage());
        }
    }

    public void cancelOrder() {
        status = "CANCELLED";
        System.out.println("Order cancelled successfully");
    }

    public void trackOrder() {
        System.out.println("Order Status: " + status);
    }
    
}
