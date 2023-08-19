import java.util.*;
public class cyclesort {
    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
     public static void sort(int a[]){
        int i=0;
        while(i<a.length){
            int cor=a[i]-1;
            if(a[i]!=a[cor]){
                swap(a,i,cor);
            }
            else{
                i++;
            }
        }

     }
     public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=temp;
        temp=arr[b];
     }
    
}
