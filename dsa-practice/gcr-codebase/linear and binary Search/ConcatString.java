import java.util.*;
public class ConcatString{
    public static void main(String[]args){
        String[] s={"Kuldeep","Singh"};
        StringBuffer t=new StringBuffer();
        for(String i:s){
            StringBuffer p=new StringBuffer(i);
            t.append(p);
        }
        System.out.println(t);
    }
}