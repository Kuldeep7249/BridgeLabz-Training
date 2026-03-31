import java.util.*;
public class Profit_and_Loss {
    public static void main(String[] args) {
        int cp=129;
        int sp=191;
        double p=(sp-cp)*100.0/cp;
        System.out.println("The Cost Price is INR "+cp+" and Selling Price is INR "+sp);
        System.out.println("The Profit is INR "+(sp-cp)+" the profit percentage is "+p);
    }
}
