public class prodectdigit {
    public static void main(String[] args) {
        int num=55;
        System.out.println(prod(num));
        
    }
    static  int prod(int n){
        if(n%10==n){
            return n;

        }
        return(n%10)*prod(n/10);


    }
    
}
