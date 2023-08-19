public class math{
    public static void main(String[] args) {
        int n=45;
        System.out.println(iseven(n));
        
    }

    private static boolean iseven(int n) {
        return (n&1)==0;
    }
}