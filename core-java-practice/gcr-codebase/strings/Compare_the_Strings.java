import java.util.*;
public class Compare_the_Strings {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        String str1 = r.next();
        String str2 = r.next();
        
        int result = str1.compareTo(str2);
        
        if (result < 0) {
            System.out.println(str1 + " comes before " + str2);
        } else if (result > 0) {
            System.out.println(str1 + " comes after " + str2);
        } else {
            System.out.println("Both strings are equal");
        }
    }
}
