public class p1582 {
    public static void main(String[] args) {
        int[][]mat = {{1,0,0},{0,0,1},{1,0,0}};
        System.out.println(numSpecial(mat));
    }
    public static int numSpecial(int[][] mat) {
       int row[]=new int[mat.length];
       int col[]=new int[mat[0].length]; 
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j]==1){
                    row[i]++;
                    col[j]++;
                } 
            }
        }
        int count=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j]==1&& row[i]==1&&col[j]==1){
                    count++;
                } 
            }
        }
        return count;

        
    }

    
}
