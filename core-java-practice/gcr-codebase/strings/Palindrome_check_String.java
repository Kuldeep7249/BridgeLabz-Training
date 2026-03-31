import java.util.*;
public class Palindrome_check_String {
    public static boolean check(String text){
        int left=0;
        int right=text.length()-1;
        while(left<=right){
            if(text.charAt(left)!=text.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return  true;
    }
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        String text=r.next();
         System.out.print(check(text));
    }
}
