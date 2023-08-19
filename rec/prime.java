public class prime {
    public static void main(String[] args) {
        int num=15;
        int i=2;
        System.out.println(isprime(num,2));
        
    }
    public static boolean isprime(int n,int i){
        if(n<=2){
            if(n==2){
                return true;
            }
            else{
                return false;
            }
        }

        if(n%i==0){
            return false;
        }
        else if(i*i>n){
            return true;
        }
        return isprime(n,i+1);
    }
    
}
