import java.util.*;
public class Display_Book_Details {
    String title;
    String author;
    int price;
    public Display_Book_Details(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public static void displayBookDetails(Display_Book_Details book) {
            System.out.println("Book Title: " + book.title);
            System.out.println("Book Author: " + book.author);
            System.out.println("Book Price: " + book.price);
            System.out.println("---------------------------");
    }
    public static void main(String[] args) {
        Display_Book_Details book1 = new Display_Book_Details("The Great Gatsby", "F. Scott Fitzgerald", 300);
        Display_Book_Details book2 = new Display_Book_Details("1984", "George Orwell", 250);
        Display_Book_Details book3 = new Display_Book_Details("To Kill a Mockingbird", "Harper Lee", 350);

        List<Display_Book_Details> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

       for (Display_Book_Details book : books) {
            displayBookDetails(book);
        }
    }
}
