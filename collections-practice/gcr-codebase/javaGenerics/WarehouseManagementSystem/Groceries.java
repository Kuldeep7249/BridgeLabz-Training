package WarehouseManagementSystem;

public class Groceries extends WarehouseItem {
    public Groceries(String name, int quantity) {
        super(name, quantity);
    }

    @Override
    public void displayInfo() {
        System.out.println("Groceries: " + getName() + ", Qty: " + getQuantity());
    }
}
