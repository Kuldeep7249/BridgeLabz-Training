import java.util.*;
public class BMI_Calculator {
    public static void main(String[] args){
        Scanner r=new Scanner(System.in);
        System.out.println("Enter Your Weight");
        double weight=r.nextDouble();
        System.out.println("Enter Your height");
        double height=r.nextDouble();
        double bmi=weight/(height*height);
         if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Category: Normal");
        } else {
            System.out.println("Category: Overweight");
        }
        r.close();
    }
}
