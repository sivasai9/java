public class p766 {
    public static void main(String[] args) {
        int[][]matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        System.out.println(isToeplitzMatrix(matrix));
        
    }
    public static boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[i].length;j++){
                if(matrix[i-1][j-1]!=matrix[i][j]){
                    return false;
                }

            }
        }
        return true;
        
    }
    
}
