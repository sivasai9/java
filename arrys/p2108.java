public class p2108 {
    public static void main(String[] args) {
        String []strwords = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(strwords));
        
    }
    public static String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(firstpali(words[i])){
                return words[i];
            }
        }
        return "";
        
    }
    public static boolean firstpali(String str){
        String s="";
        for(int i=str.length()-1;i>=0;i--){
            s+=str.charAt(i);
        }
        if(s.equals(str)) return true;

        return false;

    }
    
}
