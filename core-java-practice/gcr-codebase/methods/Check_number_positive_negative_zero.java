import java.util.*;
public class Check_number_positive_negative_zero {
    public static String check(int number){
        if(number>0){
            return "Positive number";
        }
        else if(number<0){
            return "Negative number";
        }
        else{
            return "Zero";
        }
    }
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        int number=r.nextInt();
        System.out.print("The "+number+" is "+check(number));
    }
}
