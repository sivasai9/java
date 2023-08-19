public class merge {
    public static void main(String[] args) {
       String word1 = "abc";
       String word2 = "pqryu";
       System.out.println(mergeAlternately(word1,word2));
        
    }
    public static String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        String str="";
        while(i<word1.length() && j<word2.length()){
            str=str+word1.charAt(i)+word2.charAt(j);
            i++;
            j++;
        }
        while(i<word1.length()){
            str=str+word1.charAt(i);
            i++;
        }
        while(j<word2.length()){
            str=str+word2.charAt(j);
            j++;
        }
        return str;
        
    }
}
