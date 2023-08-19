import java.util.Arrays;

public class p1112 {
    public static void main(String[] args) {
        int[]arr1 = {2,3,1,3,2,4,6,7,9,2,19};
         int[] arr2 = {2,1,4,3,9,6};
         System.out.println(relativeSortArray(arr1,arr2));

        
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int [] arr=new int[arr1.length];
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    arr[j]=arr1[j];
                }
                System.out.println(Arrays.toString(arr));
            }
        }
        return arr;
        
    }
}
