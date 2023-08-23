public class p225 {
    public static void main(String[] args) {
       String []words = {"a","b","c","ab","bc","abc"};
       String s = "abc";
       System.out.println(countPrefixes(words, s));
        
    }
    public static  int countPrefixes(String[] words, String s) {
        int count=0;
        for (String str : words) {
            int len=str.length();
            if(s.startsWith(str)){
                count++;
            }
           
        }
        return count;
    }
    
}
