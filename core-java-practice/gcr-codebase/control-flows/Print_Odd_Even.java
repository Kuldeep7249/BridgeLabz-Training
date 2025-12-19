import java.util.*;
public class Print_Odd_Even {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int number=r.nextInt();
        for(int i=1;i<number;i++){
            if(i%2==0){
            System.out.println(i+" is Even number");
            }
            else{
                System.out.println(i+" is Odd number");
            }
        }
        r.close();
    }
}
