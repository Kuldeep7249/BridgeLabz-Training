abstract class Product {
    private int id;
    private String name;
    private double price;
    
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    abstract public void calculateDiscount();
    public void displayProductInfo() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
        System.out.println("---------------------------");
    }
}
class Electronics extends Product {
    private double discountRate;

    public Electronics(int id, String name, double price, double discountRate) {
        super(id, name, price);
        this.discountRate = discountRate;
    }

    @Override
    public void calculateDiscount() {
        double discount = getPrice() * discountRate / 100;
        System.out.println("Discount on Electronics " + getName() + ": " + discount);
    }
}
class Clothing extends Product {
    private double discountAmount;

    public Clothing(int id, String name, double price, double discountAmount) {
        super(id, name, price);
        this.discountAmount = discountAmount;
    }

    @Override
    public void calculateDiscount() {
        System.out.println("Discount on Clothing " + getName() + ": " + discountAmount);
    }
}
class Groceries extends Product {
    private double seasonalDiscount;

    public Groceries(int id, String name, double price, double seasonalDiscount) {
        super(id, name, price);
        this.seasonalDiscount = seasonalDiscount;
    }

    @Override
    public void calculateDiscount() {
        double discount = getPrice() * seasonalDiscount / 100;
        System.out.println("Seasonal Discount on Groceries " + getName() + ": " + discount);
    }
}
public class Ecommerce {
    public static void main(String[] args) {
        Electronics laptop = new Electronics(1, "Laptop", 1000.0, 10.0);
        Clothing tshirt = new Clothing(2, "T-Shirt", 20.0, 5.0);
        Groceries apple = new Groceries(3, "Apple", 2.0, 15.0);
        laptop.displayProductInfo();
        laptop.calculateDiscount();
        tshirt.displayProductInfo();
        tshirt.calculateDiscount();
        apple.displayProductInfo();
        apple.calculateDiscount();
    }   
}

