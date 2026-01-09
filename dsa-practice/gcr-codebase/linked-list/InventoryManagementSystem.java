class ItemNode {
    int itemId;
    String itemName;
    int quantity;
    double price;
    ItemNode next;

    ItemNode(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

public class InventoryManagementSystem {

    private ItemNode head;

    public void addFirst(int id, String name, int qty, double price) {
        ItemNode node = new ItemNode(id, name, qty, price);
        node.next = head;
        head = node;
    }

    public void addLast(int id, String name, int qty, double price) {
        ItemNode node = new ItemNode(id, name, qty, price);
        if (head == null) {
            head = node;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void addAtPosition(int pos, int id, String name, int qty, double price) {
        if (pos <= 1 || head == null) {
            addFirst(id, name, qty, price);
            return;
        }

        ItemNode temp = head;
        int count = 1;

        while (temp.next != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }

        ItemNode node = new ItemNode(id, name, qty, price);
        node.next = temp.next;
        temp.next = node;
    }

    public void removeByItemId(int id) {
        if (head == null) return;

        if (head.itemId == id) {
            head = head.next;
            return;
        }

        ItemNode prev = head;
        ItemNode curr = head.next;

        while (curr != null) {
            if (curr.itemId == id) {
                prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    public void updateQuantity(int id, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    public void searchByItemId(int id) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    public void searchByItemName(String name) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    public void displayAll() {
        ItemNode temp = head;
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    private void displayItem(ItemNode item) {
        System.out.println(
                item.itemId + " " +
                item.itemName + " " +
                item.quantity + " " +
                item.price
        );
    }

    public void totalInventoryValue() {
        double total = 0;
        ItemNode temp = head;
        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + total);
    }

    public void sortByName(boolean ascending) {
        if (head == null) return;

        for (ItemNode i = head; i.next != null; i = i.next) {
            for (ItemNode j = i.next; j != null; j = j.next) {
                if ((ascending && i.itemName.compareToIgnoreCase(j.itemName) > 0) ||
                    (!ascending && i.itemName.compareToIgnoreCase(j.itemName) < 0)) {
                    swapData(i, j);
                }
            }
        }
    }

    public void sortByPrice(boolean ascending) {
        if (head == null) return;

        for (ItemNode i = head; i.next != null; i = i.next) {
            for (ItemNode j = i.next; j != null; j = j.next) {
                if ((ascending && i.price > j.price) ||
                    (!ascending && i.price < j.price)) {
                    swapData(i, j);
                }
            }
        }
    }

    private void swapData(ItemNode a, ItemNode b) {
        int id = a.itemId;
        String name = a.itemName;
        int qty = a.quantity;
        double price = a.price;

        a.itemId = b.itemId;
        a.itemName = b.itemName;
        a.quantity = b.quantity;
        a.price = b.price;

        b.itemId = id;
        b.itemName = name;
        b.quantity = qty;
        b.price = price;
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        ims.addLast(101, "Laptop", 5, 55000);
        ims.addLast(102, "Mouse", 20, 500);
        ims.addLast(103, "Keyboard", 10, 1500);

        ims.displayAll();
        ims.totalInventoryValue();

        ims.updateQuantity(102, 30);
        ims.sortByPrice(true);

        System.out.println("After Sorting by Price:");
        ims.displayAll();
    }
}
