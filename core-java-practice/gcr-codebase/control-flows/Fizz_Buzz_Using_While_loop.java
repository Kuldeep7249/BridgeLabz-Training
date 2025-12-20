import java.util.*;
public class Fizz_Buzz_Using_While_loop {
    public static void main(String[] args) {
            Scanner r=new Scanner(System.in);
            int n=r.nextInt();
            if(n<=0){
                return;
            }
            int i=1;
            while(i<=n){
                if((i%3==0)&&(i%5==0)){
                    System.out.println("FizzBuzz");
                }
                else if(i%3==0){
                    System.out.println("Fizz");
                }
                else if(i%5==0){
                    System.out.println("Buzz");
                }
                else{
                    System.out.println(i);
                }
                i++;
            }
            r.close();
        }    
}
