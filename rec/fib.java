package rec;

public class fib {
    public static void main(String[] args) {
        System.out.println(fib1(6));
    }
    static int fib1(int n){

        if(n<2){
            return n;
        }
        return fib1(n-1)+fib1(n-2);

    }
    
}
