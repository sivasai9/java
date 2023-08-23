import java.util.HashSet;

public class p1876 {
    public static void main(String[] args) {
        String s = "xyzzaz";
        System.out.println(countGoodSubstrings(s));
        
    }
    public static int countGoodSubstrings(String s) {
        int count=0;
        int i=0;
        int j=0;
        while(j<s.length()){
            if(j-i+1==3){
                if(s.charAt(i)!=s.charAt(i+1)&& s.charAt(i+1)!=s.charAt(i+2) && s.charAt(i+2)!=s.charAt(i)){
                    count++;
                }
                i++;
            }
            j++;
        }
        return count;
        
        
    }
    
}
