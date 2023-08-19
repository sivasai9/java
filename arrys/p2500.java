import java.util.Arrays;

public class p2500 {
    public static void main(String[] args) {
        int [][]arrgrid = {{1,2,4},{3,3,1}};
        System.out.println(deleteGreatestValue(arrgrid));
    }
    public static int deleteGreatestValue(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            Arrays.sort(grid[i]);
        }
        int res=0;
        for(int i=grid[0].length-1;i>=0;i--){
            int temp=0;
            for(int j=0;j<grid.length;j++){
                temp=Math.max(temp,grid[j][i]);
            }
            res=res+temp;
        }
        return res;
    }
    
}
