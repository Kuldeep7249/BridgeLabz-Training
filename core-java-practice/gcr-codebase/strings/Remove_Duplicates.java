import java.util.*;
public class Remove_Duplicates {
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        String text=r.next();
        String output="";
        for(char d:text.toCharArray()){
            if(!output.contains(d+"")){
                output+=d;
            }
            else{
                continue;
            }
        }
        System.out.println("the final output after removing dupliccy is :"+output);
    }
}
