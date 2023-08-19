import java.util.Arrays;

public class p2460 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1,1,0};
        applyOperations(nums);

        
    }
    public static int[] applyOperations(int[] nums) {
         int [] arr=new int[nums.length];

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }

            // System.out.println(Arrays.toString(nums));

        }

        int i = 0;
        int j = 0;
        while(i < nums.length){
            if(nums[i] != 0 ){
                arr[j++] = nums[i];
            }
            i++;
        }
        // System.out.println(Arrays.toString(arr));
        return arr;
        
    }
    
}
