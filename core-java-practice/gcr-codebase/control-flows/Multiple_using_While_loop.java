import java.util.*;
public class Multiple_using_While_loop {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int i=100;
          while(i>0){
            if(i%n==0){
                System.out.println(i);
            }
            i--;
          }  
    }
}

