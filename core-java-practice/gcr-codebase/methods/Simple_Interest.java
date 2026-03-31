import java.util.*;
public class Simple_Interest {
    public static int calculate(int p,int r,int t){
        int si=(p*r*t)/100;
        return si;
    }
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        int principal=r.nextInt();
        int rate=r.nextInt();
        int time=r.nextInt();
        System.out.println("The Simple Interest is"+(calculate(principal,rate,time)));
    }
}
