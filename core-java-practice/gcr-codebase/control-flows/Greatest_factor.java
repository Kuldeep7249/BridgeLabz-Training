import java.util.*;
public class Greatest_factor {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        for(int i=n-1;i>=1;i--){
            if(n%i==0){
                System.out.println(i);
                break;
            }
        } 
    }
}
