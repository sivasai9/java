public class countzeros {
    public static void main(String[] args) {
        int num=5053;
        System.out.println(count(num));
    }
    static int count(int num){
        return helper(num,0);
    }
    private static int helper(int n,int c){
        if(n==0){
            return c;
        }
        int rem=n%10;
        int count=0;
        if(rem==0){
            count+=helper(n/10,c+1);
        }
        return count+helper(n/10,c);


    }
}
