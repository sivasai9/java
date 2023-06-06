package pattrns;

public class pattern5 {
    public static void main(String[] args) {
        patt(5);
        
    }

    static void patt(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
