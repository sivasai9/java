public class LexicographicallySmallestPalindrome {
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(makeSmallestPalindrome(s));
        
    }
    public static String makeSmallestPalindrome(String s) {
        char ch[]=s.toCharArray();
        int i=0;
        int j=ch.length-1;
       while(i<j){
        if(ch[i]==ch[j]){
            i++;
            j--;
        }
        else{
            if(ch[i]<ch[j]){
                ch[j]=ch[i];
            }
            else{
                ch[i]=ch[j];
            }
            i++;
            j--;
        }
        
       } 
       return new String(ch);
        
    }
    
}
