import java.util.*;
public class p2553 {
    public static void main(String[] args) {
        int []arr={13,25,83,77};
        System.out.println(separateDigits(arr));
    }
    public static int[] separateDigits(int[] nums) {
        List<Integer>list=new ArrayList<>();
        for(int num:nums){
            for(char ch:String.valueOf(num).toCharArray()){
                list.add(ch-'0');
            }
        }
        int []arr=new int[list.size()];
        int k=0;
        for(int l:list){
            arr[k++]=l;
         }
        // System.out.println(Arrays.toString(arr));
        return arr;
    }
    
}
