import java.util.*;
public class QueueImplementationusingStack {
    Stack<Integer> a=new Stack();
    Stack<Integer> b=new Stack();
    public void enqueue(int t){
        a.push(t);
        System.out.println("value Added Successfully");
    }
    public int dequeue(){
        if(a.isEmpty()&&b.isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        if(b.isEmpty()){
            while(!a.isEmpty()){
                b.push(a.pop());
            }
        }
        return b.pop();
    }
    public static void main(String[] args){
        QueueImplementationusingStack q=new QueueImplementationusingStack();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        System.out.println("the popped Element is : "+q.dequeue());
        System.out.println("the popped Element is : "+q.dequeue());
        System.out.println("the popped Element is : "+q.dequeue());

    }
}
