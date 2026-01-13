package Ecommerce;
public class Main {
    public static void main(String [] args){
        Customer c=new Customer("kuldeep Singh","6395304057");
        Product p=new Product(1,"bbok",500);
        Order o=new Order(1001,p,c);
        Payment payment=new CardPayment();
        o.makePayment(payment);
        o.trackOrder();
        o.cancelOrder();
        o.trackOrder();
    }
}
