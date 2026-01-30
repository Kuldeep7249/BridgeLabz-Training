import java.util.*;
public class HexColorCode {
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        String t=r.next();
        String regex="^#[A-Za-z0-9]{6}$";
        if(t.matches(regex)){
            System.out.println("valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
