import java.util.*;
public class Track_Inventory {
    String itemCode;
    String itemName;
    int price;
    public Track_Inventory(String itemCode, String itemName, int price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    public static void displayInventoryDetails(Track_Inventory item) {
            System.out.println("Item Code: " + item.itemCode);
            System.out.println("Item Name: " + item.itemName);
            System.out.println("Item Price: " + item.price);
            System.out.println("---------------------------");
    }
    public static int totalPrice(List<Track_Inventory> items,String itemName,int Quantity) {
        int price=0;
        for (Track_Inventory item : items) {
            if(item.itemName.equalsIgnoreCase(itemName)){
                price=Quantity*item.price;
            }
        }
        return price;
    }
    public static void main(String[] args) {
        Track_Inventory item1 = new Track_Inventory("A101", "Laptop", 50);
        Track_Inventory item2 = new Track_Inventory("B202", "Smartphone", 150);
        Track_Inventory item3 = new Track_Inventory("C303", "Tablet", 80);

        List<Track_Inventory> inventory = new ArrayList<>();
        inventory.add(item1);
        inventory.add(item2);
        inventory.add(item3);

       for (Track_Inventory item : inventory) {
            displayInventoryDetails(item);
        }

         Scanner r = new Scanner(System.in);
            System.out.print("Enter the item name to calculate total price: ");
            String itemName = r.nextLine();
            System.out.print("Enter the quantity: ");   
            int quantity = r.nextInt();
            int total = totalPrice(inventory, itemName, quantity);
            if(total>0){
                System.out.println("Total price for " + quantity + " " + itemName + "(s): " + total);
            }
            else{
                System.out.println("Item not found in inventory.");
            }
    }
}
