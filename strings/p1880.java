public class p1880 {
    public static void main(String[] args) {
        String firstWord = "acb";
        String secondWord = "cba";
        String  targetWord = "cdb";
        System.out.println(isSumEqual(firstWord, secondWord, targetWord));
        
    }
    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord){
        String f="";
        String s="";
        String t="";
        for(char ch:firstWord.toCharArray()){
            f+=ch-'a';
        }
        for(char ch:secondWord.toCharArray()){
            s+=ch-'a';
        }
        for(char ch:targetWord.toCharArray()){
            t+=ch-'a';
        }

        return Integer.valueOf(f)+Integer.valueOf(s)==Integer.valueOf(t);
    }
    
    
}
