import java.util.Scanner;
public class Sum_until_Zero_Enters2 {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        double total=0.0;
        double input=r.nextDouble();
        while(true){
            if(input<=0){
                break;
            }
            total+=input;
            input=r.nextDouble();
        }
        System.out.println(total);
        r.close();
    }
}
