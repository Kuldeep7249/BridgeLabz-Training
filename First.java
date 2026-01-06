import java.util.*;
public class First {
    public static void main(String []args){
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<10;i++){
            arr[i]=r.nextInt();
        }
        for(int i=0;i<10;i++){
            arr[i]=(int)Math.pow(arr[i],2);
        }
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
