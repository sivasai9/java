import java.util.Arrays;
import java.util.HashSet;

public class p2441 {
    public static void main(String[] args) {
        int []nums = {-1,2,-3,3};
        System.out.println(findMaxK(nums));

    }
    public static int findMaxK(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=nums.length-1;i>=0;i--){
            if(set.contains(-nums[i])){
                return nums[i];
            }

        }

        
        return  -1;
    }
    
}
