public class p1758 {
    public static void main(String[] args) {
        String s = "0100";
        System.out.println(minOperations(s));
    }
    public static int minOperations(String s) {
        int count=0;
        for (int i = 0; i < s.length()/2; i+=2) {
            if(s.charAt(i)!=s.charAt(i+1)){
                count++;
            }
        }
        return count;
    }
    
}
