
public class pattern9 {
    public static void main(String[] args) {
        patt(5);
    }

    static void patt(int n){
        for(int i=0;i<n;i++){
            int spaces=n-5+i;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*n-(i+1);j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
}
