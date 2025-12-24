import java.util.*;
public class Sum_of_natural_number {
    public static int sum(int n){
        int total=0;
        for(int i=1;i<=n;i++){
            total+=i;
        }
        return total;
    }
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        System.out.print("The sum of "+n+" natural number is :"+sum(n));
    }
}
