package pattrns;

public class pattern7 {
    public static void main(String[] args) {
        patt(5);

    }
    static void patt(int n){
        for(int i=0;i<n;i++){
            int spaces=n-5+i;
            for(int s=1;s<=spaces;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
}
