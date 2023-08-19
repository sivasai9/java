public class p2185 {
    public static void main(String[] args) {
        String []words = {"pay","attention","practice","attend"};
        String  pref = "at";  
        System.out.println(prefixCount(words,pref));      
    }
    public static int prefixCount(String[] words, String pref) {
        int len=pref.length();
        int res=0;
        for(String str:words){
            if(str.length()>len) {
                String s=str.substring(0, len);
                if(s.equals(pref)){
                res++;
            }
            }
            
        }
        return res;
    }
    
}
