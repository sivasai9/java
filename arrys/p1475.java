import java.util.Arrays;

public class p1475 {
    public static void main(String[] args) {
        int[] prices = {8,4,6,2,3};
        System.out.println(Arrays.toString(finalPrices(prices)));

        
    }
    public static int[] finalPrices(int[] prices) {
        int []arr=new int[prices.length];
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]>=prices[j]){
                    arr[i]=prices[i]-prices[j];
                    break;
                }
                else{
                    arr[i]=prices[i];
                    
                }

            }
            arr[prices.length-1]=prices[i];
        }
        return arr;
        
    }
}
