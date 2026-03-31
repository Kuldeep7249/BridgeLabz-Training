import java.util.*;
public class InsertionSort {
    public static int[] sort(int []a){
        int n=a.length;
        for(int i=1;i<n;i++){
            int t=a[i];
            int k=i-1;
            while(k>=0){
                if(t<a[k]){
                    a[k+1]=a[k];
                    k--;
                }
                else{
                    a[k+1]=t;
                    break;
                }
                
            }
        }
        return a;
    }
    public static void main(String[]args){
        int a[]={1,2,3,4,5,3,2,1,4,5,6,64};
        System.out.println(Arrays.toString(sort(a)));
    }
}
