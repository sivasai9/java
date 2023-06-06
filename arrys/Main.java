
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int size=sc.nextInt();
        long [] arr1=new long[t];
        while(t-->0) {
            long[] arr = new long[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            for(int i=1;i<arr.length;i++){
                if(arr[i-1]==arr[i]){
                    System.out.print(arr[i-1]+" ");
                }

            }


        }

    }
}
