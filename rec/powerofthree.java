public class powerofthree {
    public static void main(String[] args) {
        int num=5;
        System.out.println(threepow(num));
        
    }
    public static boolean threepow(int n){
        if(n==3){
            return true;
        }
        else if(n<3){
            return false;
        }
        return threepow(n/3);
    }
    
}
