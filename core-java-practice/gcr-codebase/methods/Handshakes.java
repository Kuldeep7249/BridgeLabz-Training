import java.util.*;
public class Handshakes {
    public static int calculate(int n){
        int total=(n*(n-1))/2;
        return total;
    }
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        int students=r.nextInt();
        System.out.println("The total handshakes is"+(calculate(students)));
    }
}
