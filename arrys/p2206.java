public class p2206 {
    public static void main(String[] args) {
        int []nums = {3,2,3,2,2,2};

        System.out.println(divideArray(nums));
        
    }
    public static boolean divideArray(int[] nums) {
        int [] arr=new int[501];
        for(int i=0;i<nums.length;i++){
            nums[arr[i]]++;
        }
        for(int i:arr){
            if(i%2!=0){
                return false;

            }
        }
        return true;
    }
    
}
