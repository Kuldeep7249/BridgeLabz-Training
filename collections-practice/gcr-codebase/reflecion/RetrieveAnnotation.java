import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

@Author(name="Author Name")
class Book {}

public class RetrieveAnnotation {
    public static void main(String[] args) {
        Author a = Book.class.getAnnotation(Author.class);
        System.out.println(a.name());
    }
}