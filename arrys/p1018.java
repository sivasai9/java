import java.util.ArrayList;
import java.util.List;

public class p1018 {
    public static void main(String[] args) {
       int[] nums = {0,1,1};
       System.out.println(prefixesDivBy5(nums));

        
    }
    public static List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list=new ArrayList<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum*2+nums[i];
            if(sum%5==0){
                list.add(true);
            }
            else{
                list.add(false);
            }
            sum=sum%5;
        }

        return list;


        
    }
    
}
