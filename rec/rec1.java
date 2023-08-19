// package rec;

public class rec1 {
    public static void main(String[] args){
        print(1);
    
    }
    static void print(int n){
        // base conditon
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.print(n);
        print(n+1);
    }
    
}
