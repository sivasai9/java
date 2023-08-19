public class triangel {
    public static void main(String[] args) {
        triange(4,0);
        
    }
    static void triange(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            triange(r, c+1);
        }
        else{
            System.out.println();
            triange(r-1,0);
        }
    }
    
}
