import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class p2215 {
    public static void main(String[] args) {
        int[]nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        System.out.println(findDifference(nums1,nums2));
        
    }
     public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> set1=new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        for(int num:nums2){
            set1.add(num);
        }
        List<Integer> l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        for(int n:set){
            if(set1.contains(n)){
                set1.remove(n);
            }
            else{
                l.add(n);
            }
        }
        for(int n:set1){
            l1.add(n);
        }
        list.add(l);
        list.add(l1);
        return list;
    }
}
