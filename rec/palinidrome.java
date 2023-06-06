package rec;

public class palinidrome {
    public static void main(String[] args) {
        fun1(121);
    
       
        System.out.println(sum);
    }

    static int sum=0;
    static void fun(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        fun(n/10);
    }
    static boolean fun1(int x){
        fun(x);
        return x==sum;
    }

    
}
