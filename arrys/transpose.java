
import java.util.*;
public class transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        long [][] arr=new long[n][m];
        long [][] arr1=new long[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int a=sc.nextInt();
                arr[i][j]=a;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=arr[i][j];
                System.out.print(arr1[i][j]+" ");

            }
            System.out.println();

        }



    }
}
