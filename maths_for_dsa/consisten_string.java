import java.util.*;
public class consisten_string {
    public static void main(String[] args) {
         String allowed = "ab";
         String []words = {"ad","bd","aaab","baa","badab"};
         System.out.println(countConsistentStrings(allowed, words));
        
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        int res=words.length;
        HashSet<Character> set=new HashSet<>();
        for(char ch:allowed.toCharArray()){
            set.add(ch);
        }
        for(String str:words){
            for(char ch:str.toCharArray()){
                if(!set.contains(ch)){
                    res--;
                    break;

                }
            }
        }
        return res;

    }
    
}
