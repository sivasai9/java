import java.util.Arrays;

public class p287 {
    public static void main(String[] args) {
        int []nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));        
    }
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if((nums[i]^nums[i-1])==0){
                return nums[i];
            }

        }
        return -1;

        
    }
    
}
