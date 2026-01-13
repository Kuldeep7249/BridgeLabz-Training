package InventoryManagement;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String id;
    private String productname;


    public Product(String id, String productname) {
        this.id = id;
        this.productname = productname;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }
}
