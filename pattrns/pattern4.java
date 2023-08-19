

public class pattern4 {
    public static void main(String[] args) {
        patt(5);
        
    }
    static void patt(int n){
        for(int i=1;i<=2*n;i++){
            int col=i>n ? 2*n-i-1 :i;
            for(int j=1;j<=col;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    
    }
    
}
