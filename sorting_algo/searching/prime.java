public class prime {
    public static void main(String[] args) {
        int num=173;
        System.out.println(isprime(num));
        
    }
    public static boolean isprime(int num){
        // boolean flag=false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
       
    }
    public static boolean checkthreedigit(int num){
        int temp=num;
        while(temp<0){
            int rem=temp%10;
            if(rem==3){
                return true;
            }
            temp/=10;
        }
        return false;
    }
    
}
