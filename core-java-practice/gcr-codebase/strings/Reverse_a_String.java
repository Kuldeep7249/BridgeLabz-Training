import java.util.*;
public class Reverse_a_String {
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        String text=r.next();
        int left=0,right=text.length()-1;
        char []t=text.toCharArray();
        while(left<right){  
            char d=t[left];
            t[left]=t[right];
            t[right]=d;
            left++;
            right--;
        }
        System.out.println(new String(t));
    }
}
