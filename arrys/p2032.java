import java.util.*;

public class p2032 {
    public static void main(String[] args) {
        int[] nums1 = {1,1,3,2};
        int[] nums2 = {2,3};
        int[] nums3 = {3};
        System.out.println(twoOutOfThree(nums1, nums2, nums3));
        
    }
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();

        for(int num:nums1){
            set1.add(num);
        }
        for(int num:nums2){
            if(set1.contains(num)){
                set.add(num);
            }
            else{
                set2.add(num);
            }
        }
        for(int num:nums3){
            if(set1.contains(num) || set2.contains(num)) set.add(num);

        }
        return new ArrayList<>(set);

        
    }
    
}
