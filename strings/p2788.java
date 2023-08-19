import java.util.ArrayList;
import java.util.List;

public class p2788 {
    public static void main(String[] args) {

        
    }
    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list=new ArrayList<>();
        for(String str:words){
            String []s=str.split(separator+"");
            for (String string : s ){
                if(string.length()>=1){
                    list.add(string);
                }                
            }
        }
        return list;
        
    }
    
}
