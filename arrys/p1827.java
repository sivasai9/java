public abstract class p1827 {
    public static void main(String[] args) {
       int[] nums = {1,5,2,4,1};
       System.out.println(minOperations(nums));  
    }
    public static int minOperations(int[] nums) {
        
        int res=0;
        for(int i=0;i<nums.length-1;i++){
            int count=0;
            if(nums[i]<nums[i+1]){
                continue;
            }
            else{
                count=count+nums[i]-nums[i+1]+1; 
                res=res+count;
                nums[i+1]=count+nums[i+1];     
                }
        }
        return res;
    }
}
