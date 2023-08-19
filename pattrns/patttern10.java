

public class patttern10 {
    public static void main(String[] args) {
        patt(5);
    }
    static void patt(int n){
        for(int  i=0;i<2*n;i++){
            int col=i>n?2*n-i:i;
            int spaces=n-col;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }

            for(int  j=0;j<col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
       
    }
    
}
