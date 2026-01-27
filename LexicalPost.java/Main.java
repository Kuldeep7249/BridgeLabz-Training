import java.util.*;
public class Main {
    static Set<Character> vowel=new HashSet<>();
    static Set<Character> consonent=new HashSet<>();
    public static String reversed(String b){
        StringBuilder t=new StringBuilder(b);
        b=t.reverse().toString();
        return b;
    }
    public static String replace(String a){
        char []k=a.toCharArray();
        String l="aeiou";
        for(int i=0;i<k.length;i++){
            char w=k[i];
            if(l.contains(w+"")){
                k[i]='@';
            }
        }
        return new String(k);
    }
    public static int count(String h){
        String k="AEIOU";
        int c=0;
        for(char i:h.toCharArray()){
            if(k.contains(i+"")){
                c++;
                vowel.add(i);
            }
            else{
                consonent.add(i);
            }
        }
        return c;
    }
    public static void main (String[]args){
        Scanner r=new Scanner(System.in);
        String first=r.next();
        if (first.contains(" ")) {
            System.out.println(first + " is an invalid word");
            return;
        }
        String second=r.next();
        if (second.contains(" ")) {
            System.out.println(second + " is an invalid word");
            return;
        }
        String h=reversed(second);
        System.out.println("The reversed Version of "+second+"is "+h);
        if(h.equals(first)){
            first=reversed(first);
            first=first.toLowerCase();
            System.out.println("the transform version is : "+replace(first));
        }
        else{
            String last=first+second;
            last=last.toUpperCase();
            int vowelCount=count(last);
            int conCount=last.length()-vowelCount;
            
            System.out.println("the vowel Count :"+vowelCount);
            System.out.println("the consonent Count :"+conCount);
            if(vowelCount==conCount){
                System.out.println("Vowel and Consonent are equal");
            }
            else if(vowelCount>conCount){
                System.out.print("The vowel is : ");
                int p=0;
                for(char i:vowel){
                    if(p==2){
                        break;
                    }
                    System.out.print(i+" ");
                    p++;
                }
                
            }
            else{
                 System.out.print("The consonent is");
                int p=0;
                for(char i:consonent){
                    if(p==2){
                        break;
                    }
                    System.out.print(i+" ");
                    p++;
                }
                
            }
        }
    }
}
