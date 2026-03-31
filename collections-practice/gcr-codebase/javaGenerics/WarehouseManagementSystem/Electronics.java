package WarehouseManagementSystem;

public class Electronics extends WarehouseItem {
    public Electronics(String name, int quantity) {
        super(name, quantity);
    }

    @Override
    public void displayInfo() {
        System.out.println("Electronics: " + getName() + ", Qty: " + getQuantity());
    }
}
