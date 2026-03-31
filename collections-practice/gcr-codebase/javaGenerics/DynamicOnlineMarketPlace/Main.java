public class Main {
    public static void main(String[] args) {

        BookCategory programming = new BookCategory("Programming");
        ClothingCategory mensWear = new ClothingCategory("Men Wear");
        GadgetCategory mobile = new GadgetCategory("Mobile");

        Product<BookCategory> book =
            new Product<>("Java Complete Guide", 800, programming);

        Product<ClothingCategory> shirt =
            new Product<>("Formal Shirt", 1500, mensWear);

        Product<GadgetCategory> phone =
            new Product<>("Android Phone", 25000, mobile);

        DiscountService.applyDiscount(book, 10);
        DiscountService.applyDiscount(shirt, 20);

        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        catalog.showCatalog();
    }
}
