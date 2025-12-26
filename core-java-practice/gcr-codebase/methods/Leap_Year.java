import java.util.*;
public class Leap_Year {
    public static boolean check(int n){
        if(n%4==0){
            return true;
        }
        return false;
    }
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        int year=r.nextInt();
        if(check(year)){
            System.out.println("it is a leap year");
        }
        else{
            System.out.print("Not a Leap year");
        }
    }
}
