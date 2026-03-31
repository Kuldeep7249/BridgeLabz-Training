import java.util.*;
public class Count_the_number {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int number=r.nextInt();
        while(number>0){
            System.out.println(number--);
        }
        r.close();
    }
}
