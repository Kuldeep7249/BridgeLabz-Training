import java.util.*;
public class LicensePlateNumber {
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        String t=r.next();
        String regex="^[A-Z]{2}[0-9]{4}$";
        if(t.matches(regex)){
            System.out.println("valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
