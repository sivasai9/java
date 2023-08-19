public class p1725 {
    public static void main(String[] args) {
        int [][]rectangles = {{5,8},{3,9},{5,12},{16,5}};
        System.out.println(countGoodRectangles(rectangles));
        
    }
    public static int countGoodRectangles(int[][] rectangles) {
        int res=0;
        int max=0;
        for(int i=0;i<rectangles.length;i++){
            int val=Math.min(rectangles[i][0],rectangles[i][1]);
            if(val>max){
                max=val;
                res=1;
            }
            else if(val==max){
                res++;
            }

        }
        return res;
    }
    
}
