import java.util.Arrays;

public class p88 {
    public static void main(String[] args) {
        int[]nums1 = {1,2,3,0,0,0};
        int m = 3;
        int nums2[] = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);

        
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int[]arr=new int[m+n];
        int k=0;
        while(i<nums1.length && j<nums2.length && k<arr.length){
            
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                i++; 
                k++;
            }
            else{
                arr[k]=nums2[j];
                j++;
                k++;
            }
        
            // i++;
            // j++;
        }
        System.out.println(Arrays.toString(arr));      
    }
    
}
