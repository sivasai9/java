package sorting_algo;

import java.util.*;

public class cyclesort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }


    static void sort(int [] a){
        int i=0;
        while(i<a.length){
            int correct=a[i]-1;
            if(a[i]!=a[correct]){
                swap(a,i,correct);
            }

            else{
                i++;
            }
        }

       
    }
    static void swap(int [] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    
}
