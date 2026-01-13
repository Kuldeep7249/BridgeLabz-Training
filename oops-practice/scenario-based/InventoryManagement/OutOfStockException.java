package InventoryManagement;

public class OutOfStockException extends RuntimeException {
    public OutOfStockException(String message) throws OutOfStockException {
        super(message);
    }
}
