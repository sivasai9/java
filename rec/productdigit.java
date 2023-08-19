// package rec;

public class productdigit {
    public static void main(String[] args) {
        
        System.out.println(fun(55));
    }
    static int fun(int n){
        if(n%10==n){
            return n;
        }
        return n%10 *fun(n/10);
    }
    
}
