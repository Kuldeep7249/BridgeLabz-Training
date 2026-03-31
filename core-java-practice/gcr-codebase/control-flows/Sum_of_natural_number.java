import java.util.*;
public class Sum_of_natural_number {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int number=r.nextInt();
        int total=(number*(number+1))/2;
        if(number<0){
            System.out.println(number+ " is not a natural number");
        }
        else{
            System.out.println("the sum of "+number+" natural number is "+total );
        }
    }
}
