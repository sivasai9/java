public class onetonwihtoutloop {
    public static void main(String[] args) {
        int num=14;
        oneton(num);
    }
    public static void oneton(int n){
        if(n==0){
            return;
        }
        
        oneton(n-1);
        System.out.println(n+"");

    }
    
}
