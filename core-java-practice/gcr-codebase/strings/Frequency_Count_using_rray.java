import java.util.*;
public class Frequency_Count_using_rray {
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        String text=r.next();
        int[]freq=new int[26];
        for(int i:text.toCharArray()){
            freq[i-'a']++;
        }
        System.out.println("The Frequency of each charcater int Text is");
        for(int i=0;i<26;i++){
            System.out.println((char)(i+97)+" : "+freq[i]);
        }
    }
}
