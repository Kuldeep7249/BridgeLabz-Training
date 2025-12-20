import java.util.*;
public class Greatest_Factors_using_while_loop {
    public static void main(String[] args) {
     Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int i=n-1;
        while(i>0){
            if(n%i==0){
                System.out.println(i);
                break;
            }
            i--;
        } 
        r.close();
    }
}

