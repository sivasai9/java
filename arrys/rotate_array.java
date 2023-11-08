import java.util.*;
public class rotate_array{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(rotate(arr, 3)));
    }
    public static int[] rotate(int []arr,int k){
        if(k>arr.length){
            k=k%arr.length;
        }
        int a[]=new int[arr.length];
        for(int i=0;i<k;i++){
            a[i]=arr[arr.length-k+i];
        }
        int j=0;
        for(int i=k;i<arr.length;i++){
            a[i]=arr[j];
            j++;

        }

        return a;
    }
}