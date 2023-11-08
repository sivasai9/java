public class sub {
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,-3,4,-5};

        int cs = 0;
        int ms = 0;
        for(int i:arr){
            if(i > 0){
                cs +=i;
            }else{
                ms = Math.max(cs, ms);
                cs = 0;
            }
        }
        ms = Math.max(cs, ms);
        System.out.println(ms);

    }
    static int msum = 0;
    public static void fun(int[] arr,int idx, int sum){
        if(idx >= arr.length){
            msum = Math.max(sum,msum);
            return;
        }
        if(arr[idx] > 0){
            fun(arr, idx + 1, sum + arr[idx]);
        }
        fun(arr, idx + 1, sum);
    }
}
