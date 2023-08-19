public class p1588 {
    public static void main(String[] args) {
        int []arr = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(arr));
    }
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        int i=1;
        while(i<=arr.length){
            if(i%2!=0){
                for(int j=0;j<i;j++){
                    sum+=arr[j];
                }
                System.out.println(sum);
            }
            i++;
        }
        return sum;
        
    }
    
}
