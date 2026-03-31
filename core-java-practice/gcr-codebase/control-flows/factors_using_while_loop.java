import java.util.*;
public class factors_using_while_loop {
      public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int i=1;
        while(i<=n){
            if(n%i==0){
                System.out.println(i);
            }
            i++;
        }
        r.close();
    }
}
