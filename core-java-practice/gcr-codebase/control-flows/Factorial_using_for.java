import java.util.*;
public class Factorial_using_for {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int number=r.nextInt();
        int factorial=1;
        for(int i=number;i>0;i--){
            factorial*=i;
        }
        System.out.println("The factorial of "+number+"is "+factorial);
        r.close();
    }
}

