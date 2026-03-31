import java.util.*;
public class Power_using_While_Loop {
     public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int number=r.nextInt();
        int power=r.nextInt();
        int total=1;
        while(power>0){
            total*=number;
            power--;
        }
        System.out.println(total);
        r.close();
    }
}
