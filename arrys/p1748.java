import java.util.HashSet;

public class p1748{
    public static void main(String[] args) {
        int []nums = {1,2,3,2};
        System.out.println(sumOfUnique(nums));
        
    }
    public static int sumOfUnique(int[] nums) {
        int sum=0;
        for(int num:nums){
            if(isunique(nums,num)) sum+=num;
        }
        return sum;
    }
    public static boolean isunique(int n[],int num){
        int count=0;
        for(int n1:n){
            if(n1==num) count++;
        }
        return count==1;

    }
}