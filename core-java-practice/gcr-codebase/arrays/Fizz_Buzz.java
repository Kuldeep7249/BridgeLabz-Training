    import java.util.*;
    public class Fizz_Buzz {
        public static void main(String[] args) {
            Scanner r=new Scanner(System.in);
            int n=r.nextInt();
            if(n<=0){
                return;
            }
            for(int i=1;i<=n;i++){
                if((i%3==0)&&(i%5==0)){
                    System.out.println("Position "+i+" :FizzBuzz");
                }
                else if(i%3==0){
                    System.out.println("Position "+i+" :Fizz");
                }
                else if(i%5==0){
                    System.out.println("Position "+i+" :Buzz");
                }
                else{
                    System.out.println("Position "+i+" : "+i);
                }
            }
            r.close();
        }
    }
