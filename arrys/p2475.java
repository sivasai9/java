public class p2475 {
    public static void main(String[] args) {
        int[] nums = {4,4,2,4,3};
        System.out.println(unequalTriplets(nums));
        
    }
    public static int unequalTriplets(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
            for(int j=i+1;j<nums.length;j++)
                if(nums[i]!=nums[j]){
                    for(int k=j+1;k<nums.length;k++)
                    if(nums[j]!=nums[k]) {
                        if(nums[i]!=nums[k]){
                            count++;
                        }
                    }
                }
            
        
        return count;
    }
    
}
