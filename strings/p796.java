public class p796 {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s, goal));
    }
    public static boolean rotateString(String s, String goal) {
        int i=0;
        while(s.charAt(0)!=goal.charAt(0) && i<s.length()){
            String sub=s.substring(1);
            s=sub + s.charAt(0); 
        }
        if(s.equals(goal)){
            return true;
        }
        return false;
        
    }
    
}
