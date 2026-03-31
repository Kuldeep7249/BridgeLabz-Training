import java.util.*;
public class Power_using_for_loop {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int number=r.nextInt();
        int power=r.nextInt();
        int total=1;
        for(int i=1;i<=power;i++){
            total*=number;
        }
        System.out.println(total);
        r.close();
    }
}   
