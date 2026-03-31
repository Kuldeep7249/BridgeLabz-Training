import java.util.*;
public class FlipKey {
    public static String check(String t){
        if(t==null||t.matches(".*\\d.*")||t.length()<6){
            return "";
        }
        t=t.toLowerCase();
        String h="";
        for(char i:t.toCharArray()){
            if(i%2!=0){
                h=i+h;
            }
        }
        char p[]=h.toCharArray();
        for(int i=0;i<p.length;i+=2){
            p[i] = Character.toUpperCase(p[i]);
        }
            return new String(p);
        }
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        String t=r.nextLine();
        System.out.println(check(t));
    }   
}
