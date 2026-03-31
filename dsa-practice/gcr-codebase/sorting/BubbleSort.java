import java.util.*;
public class BubbleSort {
    public static int[] sort(int []a){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-1);j++){
                if(a[j]>=a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
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
