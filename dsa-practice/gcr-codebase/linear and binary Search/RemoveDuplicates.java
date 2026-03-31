import java.util.*;
public class RemoveDuplicates {
    public static void main(String[]args){
        String t="kuldeep";
        StringBuilder s=new StringBuilder();
        Set<Character> set=new HashSet<>();
        for(char a:t.toCharArray()){
            if(!set.contains(a)){
                s.append(a);
                set.add(a);
            }
            
        }
        System.out.println(s.toString());
    }
}
