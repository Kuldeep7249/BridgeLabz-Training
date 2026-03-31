import java.util.*;
public class Tallest_Youngest {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int amar_age=r.nextInt();
        int amar_height=r.nextInt();
        int akbar_age=r.nextInt();
        int akbar_height=r.nextInt();
        int anthony_age=r.nextInt();
        int anthony_height=r.nextInt();
        if(amar_age<akbar_age&&amar_age<anthony_age){
            System.out.println("Amar is the Youngest");
        }
        else if(akbar_age<amar_age&&akbar_age<anthony_age){
            System.out.println("Akbar is the youngext");
        }
        else{
            System.out.println("Anthony is the Youngest");
        }
        if(amar_height>akbar_height&&amar_height>anthony_height){
            System.out.println("Amar is tallest");
        }
        else if(akbar_height>amar_height&&akbar_height>anthony_height){
            System.out.println("Akbar is the tallest");
        }
        else{
            System.out.println("Anthony is the tallest");
        }
        }
    }

