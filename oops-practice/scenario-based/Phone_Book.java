import java.util.*;

class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

class LogBook {
    ArrayList<Contact> contacts = new ArrayList<>();
    void addContact(String name, String phone) {
        for (Contact c : contacts) {
            if (c.name.equals(name)) {
                System.out.println("Contact already exists.");
                return;
            }
        }
        contacts.add(new Contact(name, phone));
        System.out.println("Contact added.");
    }

    void searchContact(String name) {
        for (Contact c : contacts) {
            if (c.name.equals(name)) {
                System.out.println("Found: " + c.name + ", " + c.phone);
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    void modifyContact(String name, String newPhone) {
        for (Contact c : contacts) {
            if (c.name.equals(name)) {
                c.phone = newPhone;
                System.out.println("Contact updated.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    void deleteContact(String name) {
        Iterator<Contact> it = contacts.iterator();
        while (it.hasNext()) {
            if (it.next().name.equals(name)) {
                it.remove();
                System.out.println("Contact deleted.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }
}

public class Phone_Book {
    public static void main(String[] args) {
        LogBook book = new LogBook();

        book.addContact("Alice", "1234567890");
        book.addContact("Bob", "9876543210");

        book.searchContact("Alice");
        book.modifyContact("Alice", "1111111111");
        book.deleteContact("Bob");
        book.searchContact("Bob");
    }
}
