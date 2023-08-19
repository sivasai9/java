public class p1991 {
    public static void main(String[] args) {
        int[]nums = {2,3,-1,8,4};
        System.out.println(findMiddleIndex(nums));
        
    }
    public static int findMiddleIndex(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int[]arr1=new int[nums.length];
        int[]arr2=new int[nums.length];
        while(i<nums.length&& j>=0){
            if(i == 0 && j == nums.length -1){
                continue;
            }
            arr1[i] = arr1[i-1]+nums[i - 1];
            arr2[j] = arr2[j+1] + nums[j+1];
            if(arr1[i] == arr2[i]){
                return i;
            }
            if(arr1[j] == arr2[j]){
                return j;
            }
            i++;
            j--;
        }
        return -1;
    }
    
}
