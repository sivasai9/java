public class SplitaStringinBalancedStrings {
    public static void main(String[] args) {
        String str="RLRRLLRLRL";
        System.out.println(balancedStringSplit(str));
        
        
    }
    public static int balancedStringSplit(String s) {
        int count=0;
        int ans=0;
        for (char ch : s.toCharArray()) {
            if(ch=='R'){
                ans++;
            }
            else{
                ans--;
            }  
            if(ans==0){
                count++;
            }
        }
        return count; 
    }
}
