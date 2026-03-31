import java.util.*;
public class Most_Frequent_Character_in_a_String {
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str = r.nextLine();
    Map<Character, Integer> charCount = new HashMap<>();

    for (char c : str.toCharArray()) {
        if (c != ' ') {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
    }

    char maxChar = ' ';
    for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
        if (entry.getValue() > maxCount) {
            maxChar = entry.getKey();
        }
    }

    System.out.println("Most frequent character: " + maxChar);
    System.out.println("Frequency: " + maxCount);
    r.close();
    }
}
