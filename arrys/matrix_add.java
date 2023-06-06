
import java.util.*;
public class matrix_add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        long [][] arr=new long[n][m];
        int t=2;
        while(t-->0){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j] +=sc.nextInt();
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");;
            }
            System.out.println();
        }
    }
}
