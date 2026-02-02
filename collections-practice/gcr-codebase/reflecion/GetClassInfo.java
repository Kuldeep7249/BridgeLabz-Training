import java.lang.reflect.*;
import java.util.Scanner;

public class GetClassInfo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Class<?> c = Class.forName(sc.nextLine());

        for (Constructor<?> con : c.getDeclaredConstructors())
            System.out.println(con);

        for (Method m : c.getDeclaredMethods())
            System.out.println(m);

        for (Field f : c.getDeclaredFields())
            System.out.println(f);
    }
}