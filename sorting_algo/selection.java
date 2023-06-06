package sorting_algo;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int arr[]={4,5,1,2,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    static void selection(int arr[]){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int max=getmax(arr,0,last);
            swap(arr,max,last);
            
                }
    }
    static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    static int getmax(int []arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;
            }

        }
        return max;
    }

    
    
}
