import java.util.*;
public class Book {
    private static String LibrayName;
    private String ISBN;
    private String title;
    private String author;
    private final int isbn;
    
    public Book(){
        this.LibrayName = "City Library";
        this.title = "Unknown";
        this.author = "Unknown";
        this.isbn = 0;
    }

    public Book(String title, String author, int isbn) {
        this.LibrayName = "City Library";
        this.title = title;
        this.author = author;   
        this.isbn = isbn;
    }
    
    private  void displayLibraryName() {
        if(this instanceof Book) {
            System.out.println("Library Name: " + LibrayName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author); 
            System.out.println("ISBN: " + isbn);
            System.out.println("---------------------------");
        }
        else{
            System.out.println("Not a valid instance");
        }
    }
        public static void main(String[] args) {
            Book book1 = new Book("The Alchemist", "Paulo Coelho", 123456);
            Book book2 = new Book("1984", "George Orwell", 654321);
            Book book3=new Book();
            book1.displayLibraryName();
            book2.displayLibraryName();
            book3.displayLibraryName();
        }

}
