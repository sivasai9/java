package pattrns;

public class pattern11 {
    public static void main(String[] args) {
        patt(5);
    }
    static void patt(int n){
        for(int i=1;i<=5;i++){
            int spaces=n-i;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(" "+j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}