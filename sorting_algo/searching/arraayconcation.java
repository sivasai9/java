public class arraayconcation {
    public static void main(String[] args) {
        int []arr={7,52,2,4};
        System.out.println(findTheArrayConcVal(arr));
        
    }
    public static long findTheArrayConcVal(int[] nums) {
        int i=0;
        int j=nums.length-1;
        long con_value=0;
        while(i<j){
            String res = ""+nums[i++]+nums[j--];
            con_value+=(long)Integer.parseInt(res);
        }
        return con_value;
        
        
    }
    
}
