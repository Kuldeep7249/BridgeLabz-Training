package WarehouseManagementSystem;
import java.util.*;

public class Main {
	public static void displayAllItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.displayInfo();
        }
    }
	
	public static void main(String[] args) {
		Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 10));
        electronicsStorage.addItem(new Electronics("Mobile", 20));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice", 50));
        groceriesStorage.addItem(new Groceries("Sugar", 30));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 15));
        furnitureStorage.addItem(new Furniture("Table", 5));

        System.out.println("---- Electronics ----");
        displayAllItems(electronicsStorage.getItems());

        System.out.println("---- Groceries ----");
        displayAllItems(groceriesStorage.getItems());

        System.out.println("---- Furniture ----");
        displayAllItems(furnitureStorage.getItems());
	}

}
