import java.util.*;

public class intersection {
    public static void main(String[] args) {
        int []arr={1,2,2,1};
        int []arr2={2,2};
        System.out.println(intersect(arr, arr2));

        
    }
     public static ArrayList<Integer> intersect(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        // for(int i=0;i<nums2.length;i++){
        //     if(){
        //         list.add(nums2[j]);
        //     }
        
        return list;
        
    }
    
}
