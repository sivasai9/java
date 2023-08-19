public class p1822 {
    public static void main(String[] args) {
        int []nums = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        System.out.println(arraySign(nums));
        
    }
    public static int arraySign(int[] nums) {
        int pro=1;
        for(int i=0;i<nums.length;i++){
            pro=pro*nums[i];
        }
        System.out.println(pro);
        if(pro>0){
            return 1;
        }
        else if(pro<0){
            return -1;
        }

        return 0;

        
    }
    
}
