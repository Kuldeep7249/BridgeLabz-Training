package InventoryManagement;

public class Main {
    public static void main(String[] args) {
        Product p1=new Product("A101","Laptop");
        Product p2=new Product("A102","Phones");
        Product p3=new Product("A103","Television");
        InventoryService i=new InventoryService();
        i.addProduct(p1,20);
        i.addProduct(p2,30);
//        i.addProduct(p3,0);
        i.displayInventory();
        i.updateStock(p1,0);
    }
}
