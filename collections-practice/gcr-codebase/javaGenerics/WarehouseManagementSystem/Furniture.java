package WarehouseManagementSystem;

public class Furniture extends WarehouseItem {
    public Furniture(String name, int quantity) {
        super(name, quantity);
    }

    @Override
    public void displayInfo() {
        System.out.println("Furniture: " + getName() + ", Qty: " + getQuantity());
    }
}
