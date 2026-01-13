package InventoryManagement;

public class Inventory{

    Product product;
    private int quantity;
    private String status;

    public Inventory(Product product, int quantity) {
        this.product=product;
        this.quantity = quantity;
        this.status="IN STOCK";
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
