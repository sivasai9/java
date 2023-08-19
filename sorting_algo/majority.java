// package sorting_algo;

public class majority {
    public static void main(String[] args) {
        int [] arr={3,2,3};
        System.out.println(majorityElement(arr));

    }
    public static int majorityElement(int[] nums) {
        int majority=nums[0];
        int count=1;
        for(int j=1;j<nums.length;j++){
            if(nums[j]==majority){
                count++;
            }
            else{
                count--;
                if(count==0){
                    majority=nums[j];
                    count=1;
                }
            }
        }
       
        return majority;
        
        
    }

    
}
