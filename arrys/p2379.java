public class p2379 {
    public static void main(String[] args) {
       String blocks = "WBBWWBBWBW";
       int k = 7;
       System.out.println(minimumRecolors(blocks, k));  
    }
    public static int minimumRecolors(String blocks, int k) {
        // if(blocks.length()<k){
        //     return 0;
        // }
        int res=101;
        for(int i=0;i+k-1<blocks.length();i++){
            int count_feq=0;
                for(int j=i;j<=i+k-1;j++){
                    if(blocks.charAt(j)=='W'){
                        count_feq++;
                    }
                }
                if(count_feq==0){
                    return 0;
                }
                // System.out.println(count_feq);
                res=Math.min(res,count_feq);
            }
        
        return res;
        
    }
    
}
