import java.util.Arrays;

public class p1385 {
    public static void main(String[] args) {
        int []arr1 = {4,5,8};
        int [] arr2 = {10,9,1,8};
        System.out.println(findTheDistanceValue(arr1, arr2, 2));
        
        
    }
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count=0;
        for(int i=0;i<arr1.length;i++){
            if(agree(arr2,arr1[i],d)){
                count++;
            }
        }  
        return count; 
        
    }
    public static boolean agree(int []arr,int k,int tar){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int diff=arr[mid]-tar;
             if(Math.abs(mid)<=tar){
                 return false;
             }
            else if(k<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;

    }
    
}
