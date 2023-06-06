package arrys.spril;
import java.util.*;
public class matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int [][]arr =new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            int left=0;
            int right=arr[0].length-1;
            int top=0;
            int bottom=arr.length-1;
            int count=0;
            int total=arr[0].length*arr.length;
            while(count<total){
                // first loop
                for(int i=left;count<total && count<=right;i++){
                    System.out.print(arr[top][i]+" ");
                    count++;
                }
                top++;
                // second loop
                for(int i=top;count<total && i<=bottom;i++){
                    System.out.print(arr[i][right]+" ");
                    count++;
                }
                right--;
                // third
                for(int i=right;count<total && i>=left;i--){
                    System.out.print(arr[bottom][i]+" ");
                    count++;
                }
                bottom--;
                // loop 4
                for(int i=bottom;count<total && i>=top;i--){
                    System.out.print(arr[i][left]+" ");
                    count++;
                }
                left++;
            }
            System.out.println();
        }
    }
}
