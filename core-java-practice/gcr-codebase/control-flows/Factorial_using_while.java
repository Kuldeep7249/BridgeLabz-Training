import java.util.*;
public class Factorial_using_while {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int number=r.nextInt();
        int factorial=1;
        while(number>0){
            factorial*=number;
            number--;
        }
        System.out.println("The factorial of "+number+"is "+factorial);
        r.close();
    }
}

