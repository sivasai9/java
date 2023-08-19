import java.util.Arrays;

public class sumtriangelofarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverse(arr);
        
    }
    public static void reverse(int num[]){
        if(num.length<1){
            return;
        }
        int arr[]=new int[num.length-1];
        for (int i = 0; i < num.length-1; i++) {
            arr[i]=num[i]+num[i+1];   
        }
        reverse(arr);
        System.out.println(Arrays.toString(num));
    }
    
}
