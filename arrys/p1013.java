public class p1013 {
    public static void main(String[] args) {
        int []arr = {0,2,1,-6,6,-7,9,1,2,0,1};
        canThreePartsEqualSum(arr);
        
    }
    public static void canThreePartsEqualSum(int[] arr) {
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        System.out.println(sum);
        
    }
    
}
