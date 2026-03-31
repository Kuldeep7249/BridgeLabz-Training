import java.util.*;
public class SelectionSort {
    public static int[] sort(int []a){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int index=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[index]){
                    index=j;
                }
            }
            if(index!=i){
                swap(a,i,index);
            }
        }
        return a;
    }
    public static void swap(int []a,int f,int l){
        int t=a[f];
        a[f]=a[l];
        a[l]=t;
    }
    public static void main(String[]args){
        int a[]={1,2,3,4,5,3,2,1,4,5,6,64};
        System.out.println(Arrays.toString(sort(a)));
    }
}
