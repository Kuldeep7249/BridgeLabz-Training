import java.util.*;
public class Longest_word_in_Sentence {
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        String sentence=r.nextLine();
        String [] wordArray=sentence.split(" ");
        String output="";
        for(String h:wordArray){
            if(h.length()>output.length()){
                output=h;
            }
        }
        System.out.println("the longest word in a Sentence is :"+output);
    }
}
