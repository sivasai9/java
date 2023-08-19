import java.util.Arrays;

public class p2643 {
    public static void main(String[] args) {
        int[][]mat = {{0,1},{1,0}};
        System.out.println(Arrays.toString(rowAndMaximumOnes(mat)));
        
    }
    public static int[] rowAndMaximumOnes(int[][] mat) {
        int count1=0;
        int index=0;
        int []arr=new int[2];
        for (int i = 0; i < mat.length; i++) {
            int row_count=0;
            for ( int j = 0;j < mat[i].length;j++) {
                if(mat[i][j]==1){
                    row_count++;
                }
            }
            if(row_count>count1){
                count1=row_count;
                index=i;
            }
        }
        arr[0]=index;
        arr[1]=count1;
        return arr;
            

        }
        
    }
    

