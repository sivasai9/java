import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class p2670 {
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(distinctDifferenceArray(nums)));
        
    }
    public static int[] distinctDifferenceArray(int[] nums) {
        int [] arr=new int[nums.length];
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            HashSet<Integer> set2=new HashSet<>();
            for (int j = i+1; j < arr.length; j++) {
                set2.add(j);
            }
            arr[i]=set.size()-set2.size();
             set2.add(nums[i]);
        }
        return arr;  
    }
    
}
