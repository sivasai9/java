public class stonegame {
    public static void main(String[] args) {
        int [] arr={4,2,10,9};
        System.out.println(stoneGame(arr));
        
    }
    public static boolean stoneGame(int[] piles) {
        int a_sum=0;
        int b_sum=0;
        int i=0;
        int j=piles.length-1;
        while(i<j){
            if(piles[i]>piles[j]){
                a_sum+=piles[i];
                b_sum+=piles[j];
              
            }
            else{
                a_sum+=piles[j];
                b_sum+=piles[i];
                
            }
            i++;
            j--;
        }
        return a_sum>b_sum;

        
    }
    
}
