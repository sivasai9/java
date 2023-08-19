public class p1332 {
    public static void main(String[] args) {
        String s = "ababa";
        System.out.println(removePalindromeSub(s));
        
    }
    public static int removePalindromeSub(String s) {
        if(s.length()==0){
            return 0;
        }
        if(isp(s)) return 1;
        return 2;
        
    }
    public static boolean isp(String s){
        int left=0;
        int end=s.length()-1;
        while(left<end){
            if(s.charAt(left)!=s.charAt(end)){
                return false;
            }
            left++;
            end--;
        }
        return true;

    }
}
