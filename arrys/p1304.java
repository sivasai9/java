import java.util.Arrays;

public class p1304 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(sumZero(n)));
        
        
    }
    public static int[] sumZero(int n) {
        int []arr=new int[n];
        int start=0;
        int end=n-1;
        while(start<end){
            arr[start]=start+1;
            arr[end]=arr[start]*(-1);
            start++;
            end--;
            
        }

        // System.out.println(Arrays.toString(arr));
        return arr;
    
    }
    
}
