import java.util.*;
public class Can_Vote {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int age=r.nextInt();
        if(age>=18){
            System.out.println("the person can vote");
        }
        else{
            System.out.println("the person can not vote");
        }
    }
}
