
public class Mobile_Details {
    String brand;
    String model;
    int price;

    public Mobile_Details(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public static void displayMobileDetails(Mobile_Details mobile) {
        System.out.println("Mobile Brand: " + mobile.brand);
        System.out.println("Mobile Model: " + mobile.model);
        System.out.println("Mobile Price: " + mobile.price);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Mobile_Details mobile1 = new Mobile_Details("Apple", "iPhone 13", 999);
        Mobile_Details mobile2 = new Mobile_Details("Samsung", "Galaxy S21", 799);
        Mobile_Details mobile3 = new Mobile_Details("OnePlus", "9 Pro", 969);

        Mobile_Details[] mobiles = {mobile1, mobile2, mobile3};

        for (Mobile_Details mobile : mobiles) {
            displayMobileDetails(mobile);
        }
    }    
}
