package strings;

public class length_last_word {
    public static void main(String[] args) {
        String str="hello world";
        lengthOfLastWord(str);
    }
    public static void lengthOfLastWord(String s) {
        String str3=s.trim();
        String[] str=str3.split(" ");
        for(String w: str){
            System.out.println(w);
        }
        int x=str3.length();
        System.out.println(x);
        // System.out.println(str[8]);

    }
}
