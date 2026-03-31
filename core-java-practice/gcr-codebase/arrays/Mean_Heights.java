import java.util.*;
public class Mean_Heights {
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        double ages[]=new double[11];
        for(int i=0;i<11;i++){
            ages[i]=r.nextDouble();
        }
        double totalage=0.0;
        for(double i:ages){
            totalage+=i;
        }
        System.out.println("The mean height of football team is "+(totalage/11));
    }
}
