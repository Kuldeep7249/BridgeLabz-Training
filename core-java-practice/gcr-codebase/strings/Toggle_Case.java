import java.util.*;
public class Toggle_Case {
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        String text=r.next();
        String result = "";
        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if(Character.isUpperCase(c)){
                result += Character.toLowerCase(c);
            } else if(Character.isLowerCase(c)){
                result += Character.toUpperCase(c);
            } else {
                result += c;
            }
        }
        System.out.println(result);
    }
}
