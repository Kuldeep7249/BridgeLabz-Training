import java.util.*;
public class Multiple {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
          for(int i=100;i>0;i--){
            if(i%n==0){
                System.out.println(i);
            }
          }  
    }
}
