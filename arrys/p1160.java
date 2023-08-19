public class p1160 {
    public static void main(String[] args) {
       String[] words = {"cat","bt","hat","tree"};
       String chars = "atach";
       System.out.println(countCharacters(words, chars)); 
    }
    static int []charfreq=new int[26];
    public static int countCharacters(String[] words, String chars) {
        int count=0;
        for(char ch:chars.toCharArray()) charfreq[ch-'a']++;
        for(String str: words){
            if(check(str)){
                count=count+str.length();
            }
        }
        return count; 
    }
    public static boolean check(String str){
        int localfreq[]=new int[26];
        for(char ch:str.toCharArray()){
            localfreq[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(localfreq[i]>charfreq[i]){
                return false;
            }
        }
        return true;
    }
    
}
