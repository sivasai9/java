public class p674 {
    public static void main(String[] args) {
        int []nums = {1,3,5,4,7};
        System.out.println(findLengthOfLCIS(nums));

        
    }
    public static int findLengthOfLCIS(int[] nums) {
        int count=1;
        int max=1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]<nums[i+1]){
                count++;
            }
            else{
                count=1;
            }
            if(max<count){
                max=count;
            }
        }
        return max;
    }
    
}
