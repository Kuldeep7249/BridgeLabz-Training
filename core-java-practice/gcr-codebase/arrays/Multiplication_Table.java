import java.util.*;
public class Multiplication_Table {
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+ (n*i));
        }
    }
}
