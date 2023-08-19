import java.util.*;
public class numberofwordsinsentence {
    public static void main(String[] args) {
        String []str={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(str));

        
        
    }
    public static int mostWordsFound(String[] sentences) {
        int res=0;
        for(int i=0;i<sentences.length;i++){
            res=Math.max(res,sentences[i].split(" ").length);
        }
        return res;
        
    }
}
