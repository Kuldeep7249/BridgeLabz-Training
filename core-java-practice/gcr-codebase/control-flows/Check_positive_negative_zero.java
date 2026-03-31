import java.util.*;
public class Check_positive_negative_zero {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int number=r.nextInt();
        if(number==0){
                System.out.println("Zero");
        }
        else if(number>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
        r.close();
    }
}
