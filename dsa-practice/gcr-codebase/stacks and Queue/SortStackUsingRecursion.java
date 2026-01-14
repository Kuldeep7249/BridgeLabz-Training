import java.util.*;
public class SortStackUsingRecursion {
    public void sortStack(Stack<Integer> a){
        if(a.isEmpty()){
            return;
        }
        int x=a.pop();
        sortStack(a);
        inserted(a,x);
    }
    public void inserted(Stack<Integer> a ,int x){
        if(a.isEmpty()||a.peek()>=x){
            a.push(x);
        }
        else{
        int t=a.pop();
        inserted(a,x);
        a.push(t);
        }
    }
    public void display(Stack<Integer> a){
        while(!a.isEmpty()){
            System.out.print(a.pop()+"->");
        }
    }
    public static void main(String[]args){
        Stack<Integer> a=new Stack<>();
        SortStackUsingRecursion s=new SortStackUsingRecursion();
        a.push(20);
        a.push(30);
        a.push(40);
        a.push(50);
        // s.display(a);
        s.sortStack(a);
        s.display(a);
    }
}
