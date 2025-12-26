import java.util.*;
public class Remove_a_Specific_letter_from_the_String {
    public static void main(String[]args){
    Scanner r=new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = r.nextLine();
    System.out.print("Enter the letter to remove: ");
    char letter = r.next().charAt(0);

    String result = str.replace(String.valueOf(letter), "");
    System.out.println("Result: " + result);
    r.close();
    }
}
