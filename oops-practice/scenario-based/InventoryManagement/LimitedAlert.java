package InventoryManagement;

public class LimitedAlert implements AlertService {
    @Override
    public void limitedStock(String message) {
        System.out.println("Alert : "+message);
    }
}
