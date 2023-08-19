import java.util.Arrays;

public class reverseword {
    public static void main(String[] args) {
        String str="Let's take LeetCode contest";
        System.out.println(reverseWords(str));
        
        
    }
    public static String reverseWords(String s) {
        String str="";
        String []str2=s.split(" ");
        // System.out.println(Arrays.toString(str2));
        for(int i=0;i<str2.length;i++){
            str=str+" "+reverse(str2[i]);

        }
        return str;
    }
    public static String reverse(String str){
        String s="";
        for(int i=str.length()-1;i>=0;i--){
            s=s+str.charAt(i);
        }
        return s;
    }
    
    
}
