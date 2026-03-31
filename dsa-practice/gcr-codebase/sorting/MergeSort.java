import java.util.*;
public class MergeSort {
    public static void mergeSort(int []a,int l,int r){
        if(l<r){
            int m=(l+r)/2;
            mergeSort(a,l,m);
            mergeSort(a,m+1,r);
            merge(a,l,r,m);
        }
    }
    public static void merge(int[]a,int l,int r,int m){
        int t[]=new int[r-l+1];
        int i=l,j=m+1,k=0;
        while(i<=m&&j<=r){
            if(a[i]<=a[j]){
                t[k++]=a[i++];
            }
            else{
                t[k++]=a[j++];
            }
        }
        while(i<=m){
            t[k++]=a[i++];
        }
        while(j<=r){
            t[k++]=a[j++];
        }
        for(int p=0;p<t.length;p++){
            a[p+l]=t[p];
        }
    }
    public static void main(String[]args){
        int a[]={1,2,3,4,5,3,2,1,4,5,6,64};
        mergeSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
