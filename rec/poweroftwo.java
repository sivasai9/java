public class poweroftwo {
    public static void main(String[] args) {
        int n=-16;
        System.out.println(twopower(n));
        
    }
    public static boolean twopower(int n){
        if(n<=0)  return false;
        if(n==1) return true;
        if(n%2!=0) return false;

        return twopower(n/2);
    }
    
}
