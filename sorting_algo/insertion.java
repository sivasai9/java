
import java.util.Arrays;

public class insertion {
  


    public static void main(String[] args) {
        int [] arr={5,3,4,1,2};
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));  
    }
    static void insertion_sort(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }     
            }
        }
    }
    static void swap(int [] arr,int start,int end ){
        int temp=arr[end];
        arr[end]=arr[start];
        arr[start]=temp;
                

    }
    
}
    

