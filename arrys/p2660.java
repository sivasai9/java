public class p2660 {
    public static void main(String[] args) {
        int []player1 = {4,10,7,9};
        int []player2 = {6,5,2,3};
        isWinner(player1, player2);
    }
    public static void isWinner(int[] player1, int[] player2) {
        int sum1=0;
        int sum2=0;
        for (int i = 0; i < player1.length-1; i++) {
            if(player1[i]==10){
                
            }
            sum1=sum1+player1[i];


        }
        System.out.println(sum1);
        for (int i = 0; i < player2.length-1; i++) {
            if(player1[i]==10){
                player2[i+1]=player2[i+1]*2;
            }
            sum2=sum2+player2[i];
            
        }
        System.out.println(sum2);

        
    }
    
}
