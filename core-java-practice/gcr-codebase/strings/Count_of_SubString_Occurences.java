import java.util.*;
public class Count_of_SubString_Occurences {
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        String text=r.next();
        String substring=r.next();
        int length=substring.length();
        int total=0;
        for(int i=0;i<=text.length()-length;i++){
            String t=text.substring(i,i+length);
            if(t.equals(substring)){
                total++;
            }
        }
        System.out.print("the total occurences are :"+total);
    }
}
