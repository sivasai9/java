public class sumofdigits {
    public static void main(String[] args) {
        int num=123532;
        System.out.println(digitsum(num));
        
    }
    static int digitsum(int n){
        if(n==0){
            return 0;
        }
        return n%10+digitsum(n/10);
    }
    
}
