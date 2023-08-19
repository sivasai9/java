import java.util.*;

public class p448 {
    public static void main(String[] args) {
        int []nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
        
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
            int i=0;
            while(i<nums.length){
                int cor=nums[i]-1;
                if(nums[i]!=nums[cor]){
                    swap(nums,i,cor);
                }
                else{
                    i++;
                }
            }
            List<Integer> list=new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]!=j+1){
                    list.add(j+1);
                }
                
            }
            return list;

         }
         public static void swap(int arr[],int a,int b){
            int temp=arr[a];
            arr[a]=temp;
            temp=arr[b];
         }
        
    
}
