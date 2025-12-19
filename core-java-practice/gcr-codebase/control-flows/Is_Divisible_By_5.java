import java.util.*;
class Is_Divisible_By_5 {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        if(n%5==0){
            System.out.println(n+ " is divisible by 5");
        }
        else{
            System.out.println(n+ " is not divisible by 5");
        }
    }
}