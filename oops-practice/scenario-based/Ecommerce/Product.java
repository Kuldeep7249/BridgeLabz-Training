package Ecommerce;

public class Product {
    private int id;
    private String productName;
    private double prize;
    public Product(int id,String productName,double prize){
        this.id=id;
        this.productName=productName;
        this.prize=prize;
    }
    public double getPrize(){
        return prize;
    }
}
