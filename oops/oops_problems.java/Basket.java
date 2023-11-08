public class Basket {
    public static void main{
        int input1 = 1;
        int[] input2 = new int[2];

        long ans = 0;
        for(int i:input2){
            ans += i;
        }

        ans = ans / input1;
        int res = 0;

        for(int i:input2){
            if(i - ans > 0){
                res = res + (int)(i - ans);
            }
        }

        
    }
}
