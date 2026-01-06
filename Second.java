import java.util.*;
public class second {
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        String str=r.nextLine();
        int left=0;
        int right=str.length()-1;
        while(left<right){
            char a=str.charAt(left);
            char b=str.charAt(right);
            if(a!=b){
                System.out.print("Not a palindome");
                return;
            }
            left++;
            right--;
        }
        System.out.print("Palindrome String");
    }
}
