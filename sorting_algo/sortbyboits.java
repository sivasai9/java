import java.util.Arrays;

public class sortbyboits {
    public static void main(String[] args) {
        int []arr={0,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sort(arr)));
        
    }
     public static int[] sort(int[] arr) {
        int []arr1=arr.clone();
        for(int i=0;i<arr1.length;i++){
            for(int j=1;j<arr1.length;j++){
                if(Integer.bitCount(arr1[j])<Integer.bitCount(arr1[j-1])){
                    int temp=arr1[j];
                    arr1[j]=arr1[j-1];
                    arr1[j-1]=temp;
                }
                // System.out.println(Arrays.toString(arr1));
            }
        }
        // System.out.println(Arrays.toString(arr1));
        return arr1;
       
        

    }
    
}
