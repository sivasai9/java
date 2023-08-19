import java.util.HashSet;

public class p2395 {
    public static void main(String[] args) {
        int[]nums = {4,2,4};
        System.out.println(findSubarrays(nums));
        
    }
    public static boolean findSubarrays(int[] nums) {
        if(nums.length<2){
            return false;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            if(!set.add(nums[i]+nums[i+1])){
                return true;

            }
        }
        return false;
        
        
    }
    
}
