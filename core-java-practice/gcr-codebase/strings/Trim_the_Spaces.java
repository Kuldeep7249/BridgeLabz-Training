import java.util.*;
public class Trim_the_Spaces {
    public static void main(String []args){
        Scanner r=new Scanner(System.in);
        String text=r.nextLine();
        String updatedtext="";
        for(char i:text.toCharArray()){
            if(i==' '){
                continue;
            }
            else{
                updatedtext+=i;
            }
        }
        System.out.println("the updated text is :"+updatedtext);
    }
}
