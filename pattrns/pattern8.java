package pattrns;

public class pattern8 {
    public static void main(String[] args) {
        pattt(5);
    }
    static void pattt(int n){
        for(int i=1;i<=n;i++){
            int spaces=n-i;
            for(int s=1;s<=spaces;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

            System.out.println();

            
        

        }

    }
    
}
