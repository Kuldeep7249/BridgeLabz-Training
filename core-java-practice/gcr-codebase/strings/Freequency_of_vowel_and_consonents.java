import java.util.*;
public class Freequency_of_vowel_and_consonents {
    public static void main(String [] args){
        Scanner r=new Scanner(System.in);
        String text=r.next();
        String t="aeiouAEIOU";
        int vowelcount=0;
        int consonentcount=0;
        for(char i:text.toCharArray()){
            if(t.contains(i+"")){
                vowelcount++;
            }
            else{
                consonentcount++;
            }
        }
        System.out.println("The Frequency os vowel is: "+vowelcount);
        System.out.println("The Frequency os consonant is: "+consonentcount);
    }
}
