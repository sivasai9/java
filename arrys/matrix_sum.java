
import java.util.*;
public class matrix_sum {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<n;i++) {
            int res_sum = 0;
            for (int j = 0; j < m; j++) {
                int index_value = sc.nextInt();
                res_sum += index_value;
            }
            System.out.println(res_sum);

        }
    }
}
