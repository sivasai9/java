package arrys;

public class maxsubarray {
    public static void main(String[] args) {
        int [] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
        
    }
    public static int maxSubArray(int[] nums) {
        int lar=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                lar=lar+nums[j];

            }
        }
        return lar;
    }
    
}
