import java.util.*;
public class Count_number_using_for_loop {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int number=r.nextInt();
        for(int i=number;i>0;i--){
            System.out.println(i);
        }
        r.close();
    }
}
