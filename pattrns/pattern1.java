public class pattern1 {
    public static void main(String[] args){
        int n=5;
        patt(n);

    }

    static void patt(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");

            }
            System.out.println();
        }

    }

    
}
