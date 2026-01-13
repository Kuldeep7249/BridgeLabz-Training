package InventoryManagement;

import java.util.ArrayList;
import java.util.List;

public class InventoryService {

    List<Inventory> list_product = new ArrayList<>();

    public void addProduct(Product pro, int quantity) throws OutOfStockException {
            if(quantity==0){
                try{}
                catch (OutOfStockException e){
                    throw new OutOfStockException(e.getMessage());
                }
            }
        Inventory i = new Inventory(pro, quantity);
        list_product.add(i);

        if (quantity < 10) {
            LimitedAlert a = new LimitedAlert();
            a.limitedStock("Limited Stock left for product " + pro.getProductname());
        }

        System.out.println("Product Added Successfully");
    }

    public void updateStock(Product pro, int quantity) throws OutOfStockException {

        for (Inventory i : list_product) {
            if (i.product.getId().equals(pro.getId())) {

                i.setQuantity(quantity);

                if (quantity == 0) {
                    throw new OutOfStockException("OUT OF STOCK");
                }

                if (quantity < 10) {
                    LimitedAlert a = new LimitedAlert();
                    a.limitedStock("Limited Stock left for product " + pro.getProductname());
                }
            }
        }

        System.out.println("Product Updated Successfully");
    }

    public void displayInventory() {
        System.out.println("Product Id\tProduct Name\tQuantity\tStatus");
        for (Inventory i : list_product) {
            Product p = i.product;
            System.out.println(
                    p.getId() + "\t" +
                            p.getProductname() + "\t" +
                            i.getQuantity() + "\t" +
                            i.getStatus()
            );
        }
    }
}
