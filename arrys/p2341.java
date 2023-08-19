import java.util.Arrays;

public class p2341 {
    public static void main(String[] args) {
        int [] nums = {1,3,2,1,3,2,2};
        System.out.println(Arrays.toString(numberOfPairs(nums)));
        
    }
    public static int[] numberOfPairs(int[] nums) {
        int count=0;
        int len=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
                 nums[i]=0;
                 nums[i+1]=0;
                len=len-2;
            }

        }
         return new int[]{count,len};
        
    }
}
